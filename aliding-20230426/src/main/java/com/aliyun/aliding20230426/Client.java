// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426;

import com.aliyun.tea.*;
import com.aliyun.aliding20230426.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aliding", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public AddWorkspaceDocMembersResponse addWorkspaceDocMembersWithOptions(AddWorkspaceDocMembersRequest tmpReq, AddWorkspaceDocMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddWorkspaceDocMembersShrinkRequest request = new AddWorkspaceDocMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        AddWorkspaceDocMembersShrinkHeaders headers = new AddWorkspaceDocMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWorkspaceDocMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/addWorkspaceDocMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWorkspaceDocMembersResponse());
    }

    public AddWorkspaceDocMembersResponse addWorkspaceDocMembers(AddWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWorkspaceDocMembersHeaders headers = new AddWorkspaceDocMembersHeaders();
        return this.addWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    public AddWorkspaceMembersResponse addWorkspaceMembersWithOptions(AddWorkspaceMembersRequest tmpReq, AddWorkspaceMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddWorkspaceMembersShrinkRequest request = new AddWorkspaceMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        AddWorkspaceMembersShrinkHeaders headers = new AddWorkspaceMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWorkspaceMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/addWorkspaceMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWorkspaceMembersResponse());
    }

    public AddWorkspaceMembersResponse addWorkspaceMembers(AddWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWorkspaceMembersHeaders headers = new AddWorkspaceMembersHeaders();
        return this.addWorkspaceMembersWithOptions(request, headers, runtime);
    }

    public CreateSheetResponse createSheetWithOptions(CreateSheetRequest tmpReq, CreateSheetHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSheetShrinkRequest request = new CreateSheetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateSheetShrinkHeaders headers = new CreateSheetShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSheet"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/createSheet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSheetResponse());
    }

    public CreateSheetResponse createSheet(CreateSheetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSheetHeaders headers = new CreateSheetHeaders();
        return this.createSheetWithOptions(request, headers, runtime);
    }

    public CreateTodoTaskResponse createTodoTaskWithOptions(CreateTodoTaskRequest tmpReq, CreateTodoTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTodoTaskShrinkRequest request = new CreateTodoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateTodoTaskShrinkHeaders headers = new CreateTodoTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contentFieldList)) {
            request.contentFieldListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contentFieldList, "contentFieldList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detailUrl)) {
            request.detailUrlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detailUrl, "detailUrl", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executorIds)) {
            request.executorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executorIds, "executorIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifyConfigs)) {
            request.notifyConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifyConfigs, "notifyConfigs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.participantIds)) {
            request.participantIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.participantIds, "participantIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("operatorId", request.operatorId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentFieldListShrink)) {
            body.put("contentFieldList", request.contentFieldListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("creatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailUrlShrink)) {
            body.put("detailUrl", request.detailUrlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("dueTime", request.dueTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorIdsShrink)) {
            body.put("executorIds", request.executorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOnlyShowExecutor)) {
            body.put("isOnlyShowExecutor", request.isOnlyShowExecutor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfigsShrink)) {
            body.put("notifyConfigs", request.notifyConfigsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantIdsShrink)) {
            body.put("participantIds", request.participantIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("subject", request.subject);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTodoTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/createTodoTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTodoTaskResponse());
    }

    public CreateTodoTaskResponse createTodoTask(CreateTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateTodoTaskHeaders headers = new CreateTodoTaskHeaders();
        return this.createTodoTaskWithOptions(request, headers, runtime);
    }

    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest tmpReq, CreateWorkspaceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkspaceShrinkRequest request = new CreateWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateWorkspaceShrinkHeaders headers = new CreateWorkspaceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/createWorkspace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateWorkspaceHeaders headers = new CreateWorkspaceHeaders();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    public CreateWorkspaceDocResponse createWorkspaceDocWithOptions(CreateWorkspaceDocRequest tmpReq, CreateWorkspaceDocHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkspaceDocShrinkRequest request = new CreateWorkspaceDocShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateWorkspaceDocShrinkHeaders headers = new CreateWorkspaceDocShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            body.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentNodeId)) {
            body.put("ParentNodeId", request.parentNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspaceDoc"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/createWorkspaceDoc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceDocResponse());
    }

    public CreateWorkspaceDocResponse createWorkspaceDoc(CreateWorkspaceDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateWorkspaceDocHeaders headers = new CreateWorkspaceDocHeaders();
        return this.createWorkspaceDocWithOptions(request, headers, runtime);
    }

    public DeleteTodoTaskResponse deleteTodoTaskWithOptions(DeleteTodoTaskRequest tmpReq, DeleteTodoTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteTodoTaskShrinkRequest request = new DeleteTodoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteTodoTaskShrinkHeaders headers = new DeleteTodoTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTodoTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/deleteTodoTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTodoTaskResponse());
    }

    public DeleteTodoTaskResponse deleteTodoTask(DeleteTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteTodoTaskHeaders headers = new DeleteTodoTaskHeaders();
        return this.deleteTodoTaskWithOptions(request, headers, runtime);
    }

    public DeleteWorkspaceDocMembersResponse deleteWorkspaceDocMembersWithOptions(DeleteWorkspaceDocMembersRequest tmpReq, DeleteWorkspaceDocMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteWorkspaceDocMembersShrinkRequest request = new DeleteWorkspaceDocMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteWorkspaceDocMembersShrinkHeaders headers = new DeleteWorkspaceDocMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspaceDocMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/deleteWorkspaceDocMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceDocMembersResponse());
    }

    public DeleteWorkspaceDocMembersResponse deleteWorkspaceDocMembers(DeleteWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteWorkspaceDocMembersHeaders headers = new DeleteWorkspaceDocMembersHeaders();
        return this.deleteWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    public DeleteWorkspaceMembersResponse deleteWorkspaceMembersWithOptions(DeleteWorkspaceMembersRequest tmpReq, DeleteWorkspaceMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteWorkspaceMembersShrinkRequest request = new DeleteWorkspaceMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteWorkspaceMembersShrinkHeaders headers = new DeleteWorkspaceMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspaceMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/deleteWorkspaceMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceMembersResponse());
    }

    public DeleteWorkspaceMembersResponse deleteWorkspaceMembers(DeleteWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteWorkspaceMembersHeaders headers = new DeleteWorkspaceMembersHeaders();
        return this.deleteWorkspaceMembersWithOptions(request, headers, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest tmpReq, GetUserHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetUserShrinkRequest request = new GetUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetUserShrinkHeaders headers = new GetUserShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/getUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserHeaders headers = new GetUserHeaders();
        return this.getUserWithOptions(request, headers, runtime);
    }

    public InsertRowsBeforeResponse insertRowsBeforeWithOptions(InsertRowsBeforeRequest tmpReq, InsertRowsBeforeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertRowsBeforeShrinkRequest request = new InsertRowsBeforeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        InsertRowsBeforeShrinkHeaders headers = new InsertRowsBeforeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.row)) {
            body.put("Row", request.row);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rowCount)) {
            body.put("RowCount", request.rowCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertRowsBefore"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/insertRowsBefore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertRowsBeforeResponse());
    }

    public InsertRowsBeforeResponse insertRowsBefore(InsertRowsBeforeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsertRowsBeforeHeaders headers = new InsertRowsBeforeHeaders();
        return this.insertRowsBeforeWithOptions(request, headers, runtime);
    }

    public QueryOrgTodoTasksResponse queryOrgTodoTasksWithOptions(QueryOrgTodoTasksRequest tmpReq, QueryOrgTodoTasksHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryOrgTodoTasksShrinkRequest request = new QueryOrgTodoTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryOrgTodoTasksShrinkHeaders headers = new QueryOrgTodoTasksShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDone)) {
            body.put("isDone", request.isDone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrgTodoTasks"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/queryOrgTodoTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrgTodoTasksResponse());
    }

    public QueryOrgTodoTasksResponse queryOrgTodoTasks(QueryOrgTodoTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryOrgTodoTasksHeaders headers = new QueryOrgTodoTasksHeaders();
        return this.queryOrgTodoTasksWithOptions(request, headers, runtime);
    }

    public UpdateTodoTaskResponse updateTodoTaskWithOptions(UpdateTodoTaskRequest tmpReq, UpdateTodoTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTodoTaskShrinkRequest request = new UpdateTodoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateTodoTaskShrinkHeaders headers = new UpdateTodoTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executorIds)) {
            request.executorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executorIds, "executorIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.participantIds)) {
            request.participantIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.participantIds, "participantIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.done)) {
            body.put("done", request.done);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("dueTime", request.dueTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorIdsShrink)) {
            body.put("executorIds", request.executorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantIdsShrink)) {
            body.put("participantIds", request.participantIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTodoTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/updateTodoTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTodoTaskResponse());
    }

    public UpdateTodoTaskResponse updateTodoTask(UpdateTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTodoTaskHeaders headers = new UpdateTodoTaskHeaders();
        return this.updateTodoTaskWithOptions(request, headers, runtime);
    }

    public UpdateTodoTaskExecutorStatusResponse updateTodoTaskExecutorStatusWithOptions(UpdateTodoTaskExecutorStatusRequest tmpReq, UpdateTodoTaskExecutorStatusHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTodoTaskExecutorStatusShrinkRequest request = new UpdateTodoTaskExecutorStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateTodoTaskExecutorStatusShrinkHeaders headers = new UpdateTodoTaskExecutorStatusShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executorStatusList)) {
            request.executorStatusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executorStatusList, "executorStatusList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorStatusListShrink)) {
            body.put("executorStatusList", request.executorStatusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTodoTaskExecutorStatus"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/updateTodoTaskExecutorStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTodoTaskExecutorStatusResponse());
    }

    public UpdateTodoTaskExecutorStatusResponse updateTodoTaskExecutorStatus(UpdateTodoTaskExecutorStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTodoTaskExecutorStatusHeaders headers = new UpdateTodoTaskExecutorStatusHeaders();
        return this.updateTodoTaskExecutorStatusWithOptions(request, headers, runtime);
    }

    public UpdateWorkspaceDocMembersResponse updateWorkspaceDocMembersWithOptions(UpdateWorkspaceDocMembersRequest tmpReq, UpdateWorkspaceDocMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkspaceDocMembersShrinkRequest request = new UpdateWorkspaceDocMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateWorkspaceDocMembersShrinkHeaders headers = new UpdateWorkspaceDocMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceDocMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/updateWorkspaceDocMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceDocMembersResponse());
    }

    public UpdateWorkspaceDocMembersResponse updateWorkspaceDocMembers(UpdateWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateWorkspaceDocMembersHeaders headers = new UpdateWorkspaceDocMembersHeaders();
        return this.updateWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    public UpdateWorkspaceMembersResponse updateWorkspaceMembersWithOptions(UpdateWorkspaceMembersRequest tmpReq, UpdateWorkspaceMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkspaceMembersShrinkRequest request = new UpdateWorkspaceMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateWorkspaceMembersShrinkHeaders headers = new UpdateWorkspaceMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/updateWorkspaceMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceMembersResponse());
    }

    public UpdateWorkspaceMembersResponse updateWorkspaceMembers(UpdateWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateWorkspaceMembersHeaders headers = new UpdateWorkspaceMembersHeaders();
        return this.updateWorkspaceMembersWithOptions(request, headers, runtime);
    }
}
