// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606;

import com.aliyun.tea.*;
import com.aliyun.cams20200606.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "cams.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cams", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>Submits a request to change the destination, resume, or pause.</p>
     * 
     * @param tmpReq AddAddressRecoverSuspendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAddressRecoverSuspendResponse
     */
    public AddAddressRecoverSuspendResponse addAddressRecoverSuspendWithOptions(AddAddressRecoverSuspendRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddAddressRecoverSuspendShrinkRequest request = new AddAddressRecoverSuspendShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.auditRecord)) {
            request.auditRecordShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.auditRecord, "AuditRecord", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditRecordShrink)) {
            query.put("AuditRecord", request.auditRecordShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestType)) {
            query.put("RequestType", request.requestType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAddressRecoverSuspend"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAddressRecoverSuspendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a request to change the destination, resume, or pause.</p>
     * 
     * @param request AddAddressRecoverSuspendRequest
     * @return AddAddressRecoverSuspendResponse
     */
    public AddAddressRecoverSuspendResponse addAddressRecoverSuspend(AddAddressRecoverSuspendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAddressRecoverSuspendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Signs up for a Viber account.</p>
     * 
     * @param tmpReq AddAuditViberOpenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAuditViberOpenResponse
     */
    public AddAuditViberOpenResponse addAuditViberOpenWithOptions(AddAuditViberOpenRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddAuditViberOpenShrinkRequest request = new AddAuditViberOpenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.auditRecord)) {
            request.auditRecordShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.auditRecord, "AuditRecord", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditRecordShrink)) {
            query.put("AuditRecord", request.auditRecordShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditResult)) {
            query.put("AuditResult", request.auditResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAuditViberOpen"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAuditViberOpenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Signs up for a Viber account.</p>
     * 
     * @param request AddAuditViberOpenRequest
     * @return AddAuditViberOpenResponse
     */
    public AddAuditViberOpenResponse addAuditViberOpen(AddAuditViberOpenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAuditViberOpenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * Creating IM groups via the API is a feature in closed beta testing by Meta. Please contact your account manager to be added to the allowlist.</p>
     * </blockquote>
     * <ul>
     * <li>You can only create an IM group by calling this API.</li>
     * <li>After creating an IM group, you can call the <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> API to generate an invite link.</li>
     * <li>For the WhatsApp channel type, an IM group is limited to eight members.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM group.</p>
     * 
     * @param request AddChatGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddChatGroupResponse
     */
    public AddChatGroupResponse addChatGroupWithOptions(AddChatGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupLink)) {
            query.put("GroupLink", request.groupLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddChatGroup"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddChatGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * Creating IM groups via the API is a feature in closed beta testing by Meta. Please contact your account manager to be added to the allowlist.</p>
     * </blockquote>
     * <ul>
     * <li>You can only create an IM group by calling this API.</li>
     * <li>After creating an IM group, you can call the <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> API to generate an invite link.</li>
     * <li>For the WhatsApp channel type, an IM group is limited to eight members.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an IM group.</p>
     * 
     * @param request AddChatGroupRequest
     * @return AddChatGroupResponse
     */
    public AddChatGroupResponse addChatGroup(AddChatGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addChatGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Adding IM group invite links through the API is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that you have a successfully created IM group.</li>
     * <li>If you do not have a successfully created IM group, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation to create one.</li>
     * <li>After you call this operation to add an IM group invite link, you can use the link to invite members to join the IM group.</li>
     * <li>Currently, members can join an IM group only through an invite link.</li>
     * <li>The maximum number of members in a WhatsApp group is 8.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an invite link for an IM group.</p>
     * 
     * @param request AddChatGroupInviteLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddChatGroupInviteLinkResponse
     */
    public AddChatGroupInviteLinkResponse addChatGroupInviteLinkWithOptions(AddChatGroupInviteLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddChatGroupInviteLink"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddChatGroupInviteLinkResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Adding IM group invite links through the API is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that you have a successfully created IM group.</li>
     * <li>If you do not have a successfully created IM group, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation to create one.</li>
     * <li>After you call this operation to add an IM group invite link, you can use the link to invite members to join the IM group.</li>
     * <li>Currently, members can join an IM group only through an invite link.</li>
     * <li>The maximum number of members in a WhatsApp group is 8.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an invite link for an IM group.</p>
     * 
     * @param request AddChatGroupInviteLinkRequest
     * @return AddChatGroupInviteLinkResponse
     */
    public AddChatGroupInviteLinkResponse addChatGroupInviteLink(AddChatGroupInviteLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addChatGroupInviteLinkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China site (Chinese mainland) QPS limit for a single user on this API is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a phone number to a WABA.</p>
     * 
     * @param request AddChatappPhoneNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddChatappPhoneNumberResponse
     */
    public AddChatappPhoneNumberResponse addChatappPhoneNumberWithOptions(AddChatappPhoneNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cc)) {
            query.put("Cc", request.cc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preValidateId)) {
            query.put("PreValidateId", request.preValidateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifiedName)) {
            query.put("VerifiedName", request.verifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddChatappPhoneNumber"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddChatappPhoneNumberResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China site (Chinese mainland) QPS limit for a single user on this API is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a phone number to a WABA.</p>
     * 
     * @param request AddChatappPhoneNumberRequest
     * @return AddChatappPhoneNumberResponse
     */
    public AddChatappPhoneNumberResponse addChatappPhoneNumber(AddChatappPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addChatappPhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edits a contact - add contact.</p>
     * 
     * @param tmpReq AddContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddContactsResponse
     */
    public AddContactsResponse addContactsWithOptions(AddContactsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddContactsShrinkRequest request = new AddContactsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDetails)) {
            query.put("ContactDetails", request.contactDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groups)) {
            query.put("Groups", request.groups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needUpdate)) {
            query.put("NeedUpdate", request.needUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddContacts"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edits a contact - add contact.</p>
     * 
     * @param request AddContactsRequest
     * @return AddContactsResponse
     */
    public AddContactsResponse addContacts(AddContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addContactsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After users are submitted to a custom audience, Meta matches them. If fewer than 100 users are matched, Meta discards the data. This prevents phone numbers from being linked directly to user tokens. Each API call supports up to 10,000 user records.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds users to a custom audience.</p>
     * 
     * @param tmpReq AddCustomAudienceUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomAudienceUserResponse
     */
    public AddCustomAudienceUserResponse addCustomAudienceUserWithOptions(AddCustomAudienceUserRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddCustomAudienceUserShrinkRequest request = new AddCustomAudienceUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.users)) {
            request.usersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.users, "Users", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchLastFlag)) {
            query.put("BatchLastFlag", request.batchLastFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAudienceId)) {
            query.put("CustomAudienceId", request.customAudienceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.estimatedNumTotal)) {
            query.put("EstimatedNumTotal", request.estimatedNumTotal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usersShrink)) {
            query.put("Users", request.usersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomAudienceUser"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomAudienceUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>After users are submitted to a custom audience, Meta matches them. If fewer than 100 users are matched, Meta discards the data. This prevents phone numbers from being linked directly to user tokens. Each API call supports up to 10,000 user records.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds users to a custom audience.</p>
     * 
     * @param request AddCustomAudienceUserRequest
     * @return AddCustomAudienceUserResponse
     */
    public AddCustomAudienceUserResponse addCustomAudienceUser(AddCustomAudienceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomAudienceUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a group.</p>
     * 
     * @param tmpReq AddGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGroupResponse
     */
    public AddGroupResponse addGroupWithOptions(AddGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddGroupShrinkRequest request = new AddGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDetails)) {
            query.put("ContactDetails", request.contactDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGroup"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a group.</p>
     * 
     * @param request AddGroupRequest
     * @return AddGroupResponse
     */
    public AddGroupResponse addGroup(AddGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增营销活动</p>
     * 
     * @param tmpReq AddMarketingFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMarketingFlowResponse
     */
    public AddMarketingFlowResponse addMarketingFlowWithOptions(AddMarketingFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddMarketingFlowShrinkRequest request = new AddMarketingFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityDesc)) {
            query.put("ActivityDesc", request.activityDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityName)) {
            query.put("ActivityName", request.activityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionType)) {
            query.put("ExecutionType", request.executionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramFlag)) {
            query.put("ParamFlag", request.paramFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            query.put("Params", request.paramsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedFlowCode)) {
            query.put("RelatedFlowCode", request.relatedFlowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedFlowName)) {
            query.put("RelatedFlowName", request.relatedFlowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedGroupId)) {
            query.put("RelatedGroupId", request.relatedGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMarketingFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMarketingFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增营销活动</p>
     * 
     * @param request AddMarketingFlowRequest
     * @return AddMarketingFlowResponse
     */
    public AddMarketingFlowResponse addMarketingFlow(AddMarketingFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMarketingFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Archives a Chat App Message Service template. Currently, only WhatsApp templates support archiving.</p>
     * 
     * @param tmpReq ArchiveChatappTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ArchiveChatappTemplateResponse
     */
    public ArchiveChatappTemplateResponse archiveChatappTemplateWithOptions(ArchiveChatappTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ArchiveChatappTemplateShrinkRequest request = new ArchiveChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateList)) {
            request.templateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateList, "TemplateList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.archiveType)) {
            query.put("ArchiveType", request.archiveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateListShrink)) {
            query.put("TemplateList", request.templateListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ArchiveChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ArchiveChatappTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Archives a Chat App Message Service template. Currently, only WhatsApp templates support archiving.</p>
     * 
     * @param request ArchiveChatappTemplateRequest
     * @return ArchiveChatappTemplateResponse
     */
    public ArchiveChatappTemplateResponse archiveChatappTemplate(ArchiveChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.archiveChatappTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a DM account.</p>
     * 
     * @param tmpReq BindDmAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindDmAccountResponse
     */
    public BindDmAccountResponse bindDmAccountWithOptions(BindDmAccountRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BindDmAccountShrinkRequest request = new BindDmAccountShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendAttr)) {
            request.extendAttrShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendAttr, "ExtendAttr", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountCode)) {
            query.put("AccountCode", request.accountCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendAttrShrink)) {
            query.put("ExtendAttr", request.extendAttrShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDmAccount"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDmAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a DM account.</p>
     * 
     * @param request BindDmAccountRequest
     * @return BindDmAccountResponse
     */
    public BindDmAccountResponse bindDmAccount(BindDmAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindDmAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a page with an instance.</p>
     * 
     * @param request BindInstagramPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindInstagramPageResponse
     */
    public BindInstagramPageResponse bindInstagramPageWithOptions(BindInstagramPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindInstagramPage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindInstagramPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a page with an instance.</p>
     * 
     * @param request BindInstagramPageRequest
     * @return BindInstagramPageResponse
     */
    public BindInstagramPageResponse bindInstagramPage(BindInstagramPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindInstagramPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定选择的pageId</p>
     * 
     * @param request BindMessengerPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindMessengerPageResponse
     */
    public BindMessengerPageResponse bindMessengerPageWithOptions(BindMessengerPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindMessengerPage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindMessengerPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定选择的pageId</p>
     * 
     * @param request BindMessengerPageRequest
     * @return BindMessengerPageResponse
     */
    public BindMessengerPageResponse bindMessengerPage(BindMessengerPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindMessengerPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>资源转组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>资源转组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The per-user QPS limit for this API is 10 calls per second. If this limit is exceeded, API calls will be throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a WhatsApp Business Account (WABA) through the northbound interface.</p>
     * 
     * @param request ChatappBindWabaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatappBindWabaResponse
     */
    public ChatappBindWabaResponse chatappBindWabaWithOptions(ChatappBindWabaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappBindWaba"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappBindWabaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The per-user QPS limit for this API is 10 calls per second. If this limit is exceeded, API calls will be throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a WhatsApp Business Account (WABA) through the northbound interface.</p>
     * 
     * @param request ChatappBindWabaRequest
     * @return ChatappBindWabaResponse
     */
    public ChatappBindWabaResponse chatappBindWaba(ChatappBindWabaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappBindWabaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Migrates a phone number registration.</p>
     * 
     * @param request ChatappMigrationRegisterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatappMigrationRegisterResponse
     */
    public ChatappMigrationRegisterResponse chatappMigrationRegisterWithOptions(ChatappMigrationRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappMigrationRegister"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappMigrationRegisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Migrates a phone number registration.</p>
     * 
     * @param request ChatappMigrationRegisterRequest
     * @return ChatappMigrationRegisterResponse
     */
    public ChatappMigrationRegisterResponse chatappMigrationRegister(ChatappMigrationRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappMigrationRegisterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Manage your calls appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies a phone number for migration.</p>
     * 
     * @param request ChatappMigrationVerifiedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatappMigrationVerifiedResponse
     */
    public ChatappMigrationVerifiedResponse chatappMigrationVerifiedWithOptions(ChatappMigrationVerifiedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappMigrationVerified"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappMigrationVerifiedResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Manage your calls appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies a phone number for migration.</p>
     * 
     * @param request ChatappMigrationVerifiedRequest
     * @return ChatappMigrationVerifiedResponse
     */
    public ChatappMigrationVerifiedResponse chatappMigrationVerified(ChatappMigrationVerifiedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappMigrationVerifiedWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Mainland site (Chinese) QPS limit for a single user for this API is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Manage your calls appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Deregisters a phone number from WABA.</p>
     * 
     * @param request ChatappPhoneNumberDeregisterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatappPhoneNumberDeregisterResponse
     */
    public ChatappPhoneNumberDeregisterResponse chatappPhoneNumberDeregisterWithOptions(ChatappPhoneNumberDeregisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappPhoneNumberDeregister"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappPhoneNumberDeregisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Mainland site (Chinese) QPS limit for a single user for this API is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Manage your calls appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Deregisters a phone number from WABA.</p>
     * 
     * @param request ChatappPhoneNumberDeregisterRequest
     * @return ChatappPhoneNumberDeregisterResponse
     */
    public ChatappPhoneNumberDeregisterResponse chatappPhoneNumberDeregister(ChatappPhoneNumberDeregisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappPhoneNumberDeregisterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Mainland Messaging API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers a phone number through the northbound interface.</p>
     * 
     * @param request ChatappPhoneNumberRegisterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatappPhoneNumberRegisterResponse
     */
    public ChatappPhoneNumberRegisterResponse chatappPhoneNumberRegisterWithOptions(ChatappPhoneNumberRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappPhoneNumberRegister"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappPhoneNumberRegisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Mainland Messaging API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers a phone number through the northbound interface.</p>
     * 
     * @param request ChatappPhoneNumberRegisterRequest
     * @return ChatappPhoneNumberRegisterResponse
     */
    public ChatappPhoneNumberRegisterResponse chatappPhoneNumberRegister(ChatappPhoneNumberRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappPhoneNumberRegisterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China-specific QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes phone number information.</p>
     * 
     * @param request ChatappSyncPhoneNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatappSyncPhoneNumberResponse
     */
    public ChatappSyncPhoneNumberResponse chatappSyncPhoneNumberWithOptions(ChatappSyncPhoneNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappSyncPhoneNumber"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappSyncPhoneNumberResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China-specific QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes phone number information.</p>
     * 
     * @param request ChatappSyncPhoneNumberRequest
     * @return ChatappSyncPhoneNumberResponse
     */
    public ChatappSyncPhoneNumberResponse chatappSyncPhoneNumber(ChatappSyncPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappSyncPhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this API is 10 calls per second per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies a verification code and registers through the northbound interface.</p>
     * 
     * @param request ChatappVerifyAndRegisterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatappVerifyAndRegisterResponse
     */
    public ChatappVerifyAndRegisterResponse chatappVerifyAndRegisterWithOptions(ChatappVerifyAndRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatappVerifyAndRegister"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatappVerifyAndRegisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this API is 10 calls per second per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies a verification code and registers through the northbound interface.</p>
     * 
     * @param request ChatappVerifyAndRegisterRequest
     * @return ChatappVerifyAndRegisterResponse
     */
    public ChatappVerifyAndRegisterResponse chatappVerifyAndRegister(ChatappVerifyAndRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatappVerifyAndRegisterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the content of a WhatsApp direct-send template.</p>
     * 
     * @param tmpReq CheckDirectSendMessageSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDirectSendMessageSampleResponse
     */
    public CheckDirectSendMessageSampleResponse checkDirectSendMessageSampleWithOptions(CheckDirectSendMessageSampleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CheckDirectSendMessageSampleShrinkRequest request = new CheckDirectSendMessageSampleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.interactive)) {
            request.interactiveShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.interactive, "Interactive", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.text)) {
            request.textShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.text, "Text", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interactiveShrink)) {
            query.put("Interactive", request.interactiveShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textShrink)) {
            query.put("Text", request.textShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDirectSendMessageSample"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDirectSendMessageSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the content of a WhatsApp direct-send template.</p>
     * 
     * @param request CheckDirectSendMessageSampleRequest
     * @return CheckDirectSendMessageSampleResponse
     */
    public CheckDirectSendMessageSampleResponse checkDirectSendMessageSample(CheckDirectSendMessageSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDirectSendMessageSampleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a template.</p>
     * 
     * @param request CopyTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyTemplateResponse
     */
    public CopyTemplateResponse copyTemplateWithOptions(CopyTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneTemplateCode)) {
            query.put("SceneTemplateCode", request.sceneTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneTemplateName)) {
            query.put("SceneTemplateName", request.sceneTemplateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a template.</p>
     * 
     * @param request CopyTemplateRequest
     * @return CopyTemplateResponse
     */
    public CopyTemplateResponse copyTemplate(CopyTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation creates a flow. You can also create a flow manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> interface.</li>
     * <li>After you create a flow, you can orchestrate the canvas. For more information, see <a href="https://help.aliyun.com/document_detail/2836818.html">Flow Editor components</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow.</p>
     * 
     * @param tmpReq CreateChatFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatFlowResponse
     */
    public CreateChatFlowResponse createChatFlowWithOptions(CreateChatFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateChatFlowShrinkRequest request = new CreateChatFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowTriggerType)) {
            query.put("FlowTriggerType", request.flowTriggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation creates a flow. You can also create a flow manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> interface.</li>
     * <li>After you create a flow, you can orchestrate the canvas. For more information, see <a href="https://help.aliyun.com/document_detail/2836818.html">Flow Editor components</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow.</p>
     * 
     * @param request CreateChatFlowRequest
     * @return CreateChatFlowResponse
     */
    public CreateChatFlowResponse createChatFlow(CreateChatFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to create and import a flow. You can also create and import a flow manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>.</li>
     * <li>Before you call this operation, ensure that you have exported the Domain-Specific Language (DSL) data for the flow.</li>
     * <li>If you do not have the exported DSL data for a flow, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>. Click a flow name to open the canvas. Arrange the components on the canvas, save the flow, and then export it as a JSON data file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates and imports a flow.</p>
     * 
     * @param tmpReq CreateChatFlowByImportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatFlowByImportResponse
     */
    public CreateChatFlowByImportResponse createChatFlowByImportWithOptions(CreateChatFlowByImportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateChatFlowByImportShrinkRequest request = new CreateChatFlowByImportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowViewModel)) {
            query.put("FlowViewModel", request.flowViewModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatFlowByImport"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatFlowByImportResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to create and import a flow. You can also create and import a flow manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>.</li>
     * <li>Before you call this operation, ensure that you have exported the Domain-Specific Language (DSL) data for the flow.</li>
     * <li>If you do not have the exported DSL data for a flow, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>. Click a flow name to open the canvas. Arrange the components on the canvas, save the flow, and then export it as a JSON data file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates and imports a flow.</p>
     * 
     * @param request CreateChatFlowByImportRequest
     * @return CreateChatFlowByImportResponse
     */
    public CreateChatFlowByImportResponse createChatFlowByImport(CreateChatFlowByImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatFlowByImportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To update the log settings for a flow using the API, you must first create the log settings. After the settings are created, call the <a href="https://help.aliyun.com/document_detail/2937212.html">ReadChatFlowLogSetting</a> operation to view the log settings. Then, call the <a href="https://help.aliyun.com/document_detail/2937210.html">UpdateChatFlowLogSetting</a> operation to update the settings.</li>
     * <li>If you do not need to update the log settings using the API, you can manually update the log settings on the Log page. In the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>, choose <strong>Settings</strong> &gt; <strong>Log</strong>.</li>
     * <li>Before you call this operation, make sure that you have successfully created a flow.</li>
     * <li>If you do not have a successfully created flow, you can create one manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> or by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates log settings for a flow.</p>
     * 
     * @param request CreateChatFlowLogSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatFlowLogSettingResponse
     */
    public CreateChatFlowLogSettingResponse createChatFlowLogSettingWithOptions(CreateChatFlowLogSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatFlowLogSetting"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatFlowLogSettingResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To update the log settings for a flow using the API, you must first create the log settings. After the settings are created, call the <a href="https://help.aliyun.com/document_detail/2937212.html">ReadChatFlowLogSetting</a> operation to view the log settings. Then, call the <a href="https://help.aliyun.com/document_detail/2937210.html">UpdateChatFlowLogSetting</a> operation to update the settings.</li>
     * <li>If you do not need to update the log settings using the API, you can manually update the log settings on the Log page. In the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>, choose <strong>Settings</strong> &gt; <strong>Log</strong>.</li>
     * <li>Before you call this operation, make sure that you have successfully created a flow.</li>
     * <li>If you do not have a successfully created flow, you can create one manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> or by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates log settings for a flow.</p>
     * 
     * @param request CreateChatFlowLogSettingRequest
     * @return CreateChatFlowLogSettingResponse
     */
    public CreateChatFlowLogSettingResponse createChatFlowLogSetting(CreateChatFlowLogSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatFlowLogSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates the migration of a phone number.</p>
     * 
     * @param request CreateChatappMigrationInitiateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatappMigrationInitiateResponse
     */
    public CreateChatappMigrationInitiateResponse createChatappMigrationInitiateWithOptions(CreateChatappMigrationInitiateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNumber)) {
            query.put("MobileNumber", request.mobileNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatappMigrationInitiate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatappMigrationInitiateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates the migration of a phone number.</p>
     * 
     * @param request CreateChatappMigrationInitiateRequest
     * @return CreateChatappMigrationInitiateResponse
     */
    public CreateChatappMigrationInitiateResponse createChatappMigrationInitiate(CreateChatappMigrationInitiateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatappMigrationInitiateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API operation is 50 for a single user. If you exceed the limit, API calls are rate-limited, which may affect your business. We recommend that you call this operation at a reasonable frequency.</p>
     * <h3>Status change</h3>
     * <p>You can monitor template status and quality changes using Message Service (MNS) or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Message receipts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a message template. After a template is approved, you can use it to send messages.</p>
     * 
     * @param tmpReq CreateChatappTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatappTemplateResponse
     */
    public CreateChatappTemplateResponse createChatappTemplateWithOptions(CreateChatappTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateChatappTemplateShrinkRequest request = new CreateChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.example)) {
            request.exampleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.example, "Example", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowCategoryChange)) {
            body.put("AllowCategoryChange", request.allowCategoryChange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryChangePaused)) {
            body.put("CategoryChangePaused", request.categoryChangePaused);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            body.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exampleShrink)) {
            body.put("Example", request.exampleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            body.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageSendTtlSeconds)) {
            body.put("MessageSendTtlSeconds", request.messageSendTtlSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatappTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API operation is 50 for a single user. If you exceed the limit, API calls are rate-limited, which may affect your business. We recommend that you call this operation at a reasonable frequency.</p>
     * <h3>Status change</h3>
     * <p>You can monitor template status and quality changes using Message Service (MNS) or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Message receipts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a message template. After a template is approved, you can use it to send messages.</p>
     * 
     * @param request CreateChatappTemplateRequest
     * @return CreateChatappTemplateResponse
     */
    public CreateChatappTemplateResponse createChatappTemplate(CreateChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatappTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom audience.</p>
     * 
     * @param request CreateCustomAudienceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomAudienceResponse
     */
    public CreateCustomAudienceResponse createCustomAudienceWithOptions(CreateCustomAudienceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomAudience"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomAudienceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom audience.</p>
     * 
     * @param request CreateCustomAudienceRequest
     * @return CreateCustomAudienceResponse
     */
    public CreateCustomAudienceResponse createCustomAudience(CreateCustomAudienceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomAudienceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service (Chinese SMS) API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Flow.</p>
     * 
     * @param tmpReq CreateFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFlowShrinkRequest request = new CreateFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categories)) {
            request.categoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categories, "Categories", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoriesShrink)) {
            query.put("Categories", request.categoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointUri)) {
            query.put("EndpointUri", request.endpointUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            query.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service (Chinese SMS) API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Flow.</p>
     * 
     * @param request CreateFlowRequest
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to create a new flow version. You can also manually copy a flow version from the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>. To do this, click a flow name to open the orchestration canvas and then copy the version.</li>
     * <li>Before you call this operation, make sure that you have created a flow.</li>
     * <li>If you have not created a flow, you can create one manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> or by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new version of a flow by copying an existing version.</p>
     * 
     * @param tmpReq CreateFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowVersionResponse
     */
    public CreateFlowVersionResponse createFlowVersionWithOptions(CreateFlowVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFlowVersionShrinkRequest request = new CreateFlowVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersionCopyFrom)) {
            query.put("FlowVersionCopyFrom", request.flowVersionCopyFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowVersion"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to create a new flow version. You can also manually copy a flow version from the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>. To do this, click a flow name to open the orchestration canvas and then copy the version.</li>
     * <li>Before you call this operation, make sure that you have created a flow.</li>
     * <li>If you have not created a flow, you can create one manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> or by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new version of a flow by copying an existing version.</p>
     * 
     * @param request CreateFlowVersionRequest
     * @return CreateFlowVersionResponse
     */
    public CreateFlowVersionResponse createFlowVersion(CreateFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactMail)) {
            query.put("ContactMail", request.contactMail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facebookBmId)) {
            query.put("FacebookBmId", request.facebookBmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            query.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isConfirmAudit)) {
            query.put("IsConfirmAudit", request.isConfirmAudit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvTerms)) {
            query.put("IsvTerms", request.isvTerms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeAddress)) {
            query.put("OfficeAddress", request.officeAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a budget.</p>
     * 
     * @param request CreateMessageCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMessageCampaignResponse
     */
    public CreateMessageCampaignResponse createMessageCampaignWithOptions(CreateMessageCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budget)) {
            query.put("Budget", request.budget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetType)) {
            query.put("BudgetType", request.budgetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMessageCampaign"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMessageCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a budget.</p>
     * 
     * @param request CreateMessageCampaignRequest
     * @return CreateMessageCampaignResponse
     */
    public CreateMessageCampaignResponse createMessageCampaign(CreateMessageCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMessageCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>嵌入式授权messenger</p>
     * 
     * @param tmpReq CreateMessengerPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMessengerPageResponse
     */
    public CreateMessengerPageResponse createMessengerPageWithOptions(CreateMessengerPageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMessengerPageShrinkRequest request = new CreateMessengerPageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adAccountIds)) {
            request.adAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adAccountIds, "AdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountIdsShrink)) {
            query.put("AdAccountIds", request.adAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticationCode)) {
            query.put("AuthenticationCode", request.authenticationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMessengerPage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMessengerPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>嵌入式授权messenger</p>
     * 
     * @param request CreateMessengerPageRequest
     * @return CreateMessengerPageResponse
     */
    public CreateMessengerPageResponse createMessengerPage(CreateMessengerPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMessengerPageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After the QR code is created, users can scan it with WhatsApp to quickly open the corresponding business phone number.</li>
     * <li>Before calling this operation, make sure that you have a successfully created WhatsApp message channel.</li>
     * <li>If you do not have a successfully created WhatsApp message channel, manually create one on the
     * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a>
     * page.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a message QR code.</p>
     * 
     * @param request CreatePhoneMessageQrdlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePhoneMessageQrdlResponse
     */
    public CreatePhoneMessageQrdlResponse createPhoneMessageQrdlWithOptions(CreatePhoneMessageQrdlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateQrImage)) {
            query.put("GenerateQrImage", request.generateQrImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefilledMessage)) {
            query.put("PrefilledMessage", request.prefilledMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePhoneMessageQrdl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePhoneMessageQrdlResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After the QR code is created, users can scan it with WhatsApp to quickly open the corresponding business phone number.</li>
     * <li>Before calling this operation, make sure that you have a successfully created WhatsApp message channel.</li>
     * <li>If you do not have a successfully created WhatsApp message channel, manually create one on the
     * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a>
     * page.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a message QR code.</p>
     * 
     * @param request CreatePhoneMessageQrdlRequest
     * @return CreatePhoneMessageQrdlResponse
     */
    public CreatePhoneMessageQrdlResponse createPhoneMessageQrdl(CreatePhoneMessageQrdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPhoneMessageQrdlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据嵌入式code获取pageId入库</p>
     * 
     * @param tmpReq CreateWhatsappConversionApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWhatsappConversionApiResponse
     */
    public CreateWhatsappConversionApiResponse createWhatsappConversionApiWithOptions(CreateWhatsappConversionApiRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWhatsappConversionApiShrinkRequest request = new CreateWhatsappConversionApiShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.permissions)) {
            request.permissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.permissions, "Permissions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionsShrink)) {
            query.put("Permissions", request.permissionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWhatsappConversionApi"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWhatsappConversionApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据嵌入式code获取pageId入库</p>
     * 
     * @param request CreateWhatsappConversionApiRequest
     * @return CreateWhatsappConversionApiResponse
     */
    public CreateWhatsappConversionApiResponse createWhatsappConversionApi(CreateWhatsappConversionApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWhatsappConversionApiWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to delete a flow. You can also manually delete a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>.</li>
     * <li>Before you delete a flow, make sure its status is Unpublished.</li>
     * <li>Deleted flows cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow.</p>
     * 
     * @param tmpReq DeleteChatFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChatFlowResponse
     */
    public DeleteChatFlowResponse deleteChatFlowWithOptions(DeleteChatFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteChatFlowShrinkRequest request = new DeleteChatFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChatFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to delete a flow. You can also manually delete a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>.</li>
     * <li>Before you delete a flow, make sure its status is Unpublished.</li>
     * <li>Deleted flows cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow.</p>
     * 
     * @param request DeleteChatFlowRequest
     * @return DeleteChatFlowResponse
     */
    public DeleteChatFlowResponse deleteChatFlow(DeleteChatFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChatFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The API-based IM group deletion feature is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that you have a successfully created IM group.</li>
     * <li>If you do not have a successfully created IM group, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation to create one.</li>
     * <li>A deleted IM group cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a successfully created IM group.</p>
     * 
     * @param request DeleteChatGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChatGroupResponse
     */
    public DeleteChatGroupResponse deleteChatGroupWithOptions(DeleteChatGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChatGroup"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The API-based IM group deletion feature is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that you have a successfully created IM group.</li>
     * <li>If you do not have a successfully created IM group, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation to create one.</li>
     * <li>A deleted IM group cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a successfully created IM group.</p>
     * 
     * @param request DeleteChatGroupRequest
     * @return DeleteChatGroupResponse
     */
    public DeleteChatGroupResponse deleteChatGroup(DeleteChatGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChatGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The ability to delete IM group invitation links through the API is a Meta beta feature. Contact your account manager to request access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that the IM group you created already has an IM group invitation link added.</li>
     * <li>If you do not have an existing IM group, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations to create an IM group and add an invitation link.</li>
     * <li>After you delete an IM group invitation link, the IM group can no longer invite members to join. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IM group invitation link.</p>
     * 
     * @param request DeleteChatGroupInviteLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChatGroupInviteLinkResponse
     */
    public DeleteChatGroupInviteLinkResponse deleteChatGroupInviteLinkWithOptions(DeleteChatGroupInviteLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChatGroupInviteLink"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatGroupInviteLinkResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The ability to delete IM group invitation links through the API is a Meta beta feature. Contact your account manager to request access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that the IM group you created already has an IM group invitation link added.</li>
     * <li>If you do not have an existing IM group, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations to create an IM group and add an invitation link.</li>
     * <li>After you delete an IM group invitation link, the IM group can no longer invite members to join. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an IM group invitation link.</p>
     * 
     * @param request DeleteChatGroupInviteLinkRequest
     * @return DeleteChatGroupInviteLinkResponse
     */
    public DeleteChatGroupInviteLinkResponse deleteChatGroupInviteLink(DeleteChatGroupInviteLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChatGroupInviteLinkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This operation is a beta feature from Meta. Contact your account manager to add your account to the allowlist before use.</p>
     * </blockquote>
     * <ul>
     * <li>This operation requires an existing IM group that members have joined via an invitation link.</li>
     * <li>To create an IM group and add an invitation link, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations.</li>
     * <li>Removed members no longer receive messages from the group. Use this operation with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes members from an IM group.</p>
     * 
     * @param tmpReq DeleteChatGroupParticipantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChatGroupParticipantsResponse
     */
    public DeleteChatGroupParticipantsResponse deleteChatGroupParticipantsWithOptions(DeleteChatGroupParticipantsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteChatGroupParticipantsShrinkRequest request = new DeleteChatGroupParticipantsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.list)) {
            request.listShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.list, "List", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listShrink)) {
            query.put("List", request.listShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChatGroupParticipants"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatGroupParticipantsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This operation is a beta feature from Meta. Contact your account manager to add your account to the allowlist before use.</p>
     * </blockquote>
     * <ul>
     * <li>This operation requires an existing IM group that members have joined via an invitation link.</li>
     * <li>To create an IM group and add an invitation link, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations.</li>
     * <li>Removed members no longer receive messages from the group. Use this operation with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes members from an IM group.</p>
     * 
     * @param request DeleteChatGroupParticipantsRequest
     * @return DeleteChatGroupParticipantsResponse
     */
    public DeleteChatGroupParticipantsResponse deleteChatGroupParticipants(DeleteChatGroupParticipantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChatGroupParticipantsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a message template.</p>
     * 
     * @param request DeleteChatappTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChatappTemplateResponse
     */
    public DeleteChatappTemplateResponse deleteChatappTemplateWithOptions(DeleteChatappTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatappTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a message template.</p>
     * 
     * @param request DeleteChatappTemplateRequest
     * @return DeleteChatappTemplateResponse
     */
    public DeleteChatappTemplateResponse deleteChatappTemplate(DeleteChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChatappTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑联系人-删除联系人</p>
     * 
     * @param tmpReq DeleteContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactsResponse
     */
    public DeleteContactsResponse deleteContactsWithOptions(DeleteContactsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteContactsShrinkRequest request = new DeleteContactsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDetails)) {
            query.put("ContactDetails", request.contactDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContacts"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑联系人-删除联系人</p>
     * 
     * @param request DeleteContactsRequest
     * @return DeleteContactsResponse
     */
    public DeleteContactsResponse deleteContacts(DeleteContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes contacts by selecting and removing them.</p>
     * 
     * @param request DeleteContactsByIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactsByIdsResponse
     */
    public DeleteContactsByIdsResponse deleteContactsByIdsWithOptions(DeleteContactsByIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contacts)) {
            query.put("Contacts", request.contacts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContactsByIds"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactsByIdsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes contacts by selecting and removing them.</p>
     * 
     * @param request DeleteContactsByIdsRequest
     * @return DeleteContactsByIdsResponse
     */
    public DeleteContactsByIdsResponse deleteContactsByIds(DeleteContactsByIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactsByIdsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Flow (only Flows in DRAFT status can be deleted).</p>
     * 
     * @param request DeleteFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Flow (only Flows in DRAFT status can be deleted).</p>
     * 
     * @param request DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to delete a flow version, or click a flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> to go to the canvas orchestration page and manually delete the flow version.</li>
     * <li>Before calling this operation, make sure that the flow version is in the offline state and that at least two flow versions exist.</li>
     * <li>If the flow version is in the online state, click the flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> to go to the canvas orchestration page and manually take the flow version offline, or call the <a href="https://help.aliyun.com/document_detail/2937198.html">OfflineFlowVersion</a> operation to take the flow version offline.</li>
     * <li>After a flow version is deleted, the canvas flow that you orchestrated cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow version.</p>
     * 
     * @param tmpReq DeleteFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowVersionResponse
     */
    public DeleteFlowVersionResponse deleteFlowVersionWithOptions(DeleteFlowVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteFlowVersionShrinkRequest request = new DeleteFlowVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowVersion"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to delete a flow version, or click a flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> to go to the canvas orchestration page and manually delete the flow version.</li>
     * <li>Before calling this operation, make sure that the flow version is in the offline state and that at least two flow versions exist.</li>
     * <li>If the flow version is in the online state, click the flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> to go to the canvas orchestration page and manually take the flow version offline, or call the <a href="https://help.aliyun.com/document_detail/2937198.html">OfflineFlowVersion</a> operation to take the flow version offline.</li>
     * <li>After a flow version is deleted, the canvas flow that you orchestrated cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow version.</p>
     * 
     * @param request DeleteFlowVersionRequest
     * @return DeleteFlowVersionResponse
     */
    public DeleteFlowVersionResponse deleteFlowVersion(DeleteFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除群组</p>
     * 
     * @param request DeleteGroupByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupByIdResponse
     */
    public DeleteGroupByIdResponse deleteGroupByIdWithOptions(DeleteGroupByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroupById"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除群组</p>
     * 
     * @param request DeleteGroupByIdRequest
     * @return DeleteGroupByIdResponse
     */
    public DeleteGroupByIdResponse deleteGroupById(DeleteGroupByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除ins的page</p>
     * 
     * @param request DeleteInstagramPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstagramPageResponse
     */
    public DeleteInstagramPageResponse deleteInstagramPageWithOptions(DeleteInstagramPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstagramPage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstagramPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除ins的page</p>
     * 
     * @param request DeleteInstagramPageRequest
     * @return DeleteInstagramPageResponse
     */
    public DeleteInstagramPageResponse deleteInstagramPage(DeleteInstagramPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstagramPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a marketing campaign.</p>
     * 
     * @param request DeleteMarketingFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMarketingFlowResponse
     */
    public DeleteMarketingFlowResponse deleteMarketingFlowWithOptions(DeleteMarketingFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityCode)) {
            query.put("ActivityCode", request.activityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMarketingFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMarketingFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a marketing campaign.</p>
     * 
     * @param request DeleteMarketingFlowRequest
     * @return DeleteMarketingFlowResponse
     */
    public DeleteMarketingFlowResponse deleteMarketingFlow(DeleteMarketingFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMarketingFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the budget for a marketing campaign.</p>
     * 
     * @param request DeleteMessageCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMessageCampaignResponse
     */
    public DeleteMessageCampaignResponse deleteMessageCampaignWithOptions(DeleteMessageCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMessageCampaign"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMessageCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the budget for a marketing campaign.</p>
     * 
     * @param request DeleteMessageCampaignRequest
     * @return DeleteMessageCampaignResponse
     */
    public DeleteMessageCampaignResponse deleteMessageCampaign(DeleteMessageCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMessageCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除messenger的page</p>
     * 
     * @param request DeleteMessengerPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMessengerPageResponse
     */
    public DeleteMessengerPageResponse deleteMessengerPageWithOptions(DeleteMessengerPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMessengerPage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMessengerPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除messenger的page</p>
     * 
     * @param request DeleteMessengerPageRequest
     * @return DeleteMessengerPageResponse
     */
    public DeleteMessengerPageResponse deleteMessengerPage(DeleteMessengerPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMessengerPageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you delete a message QR code, users can no longer open the corresponding business phone number by scanning the original QR code. Proceed with caution.</li>
     * <li>Before calling this operation, make sure that you have a successfully created message QR code.</li>
     * <li>If you do not have a successfully created message QR code, call the <a href="https://help.aliyun.com/document_detail/2638749.html">CreatePhoneMessageQrdl</a> operation to create one first.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a message QR code.</p>
     * 
     * @param request DeletePhoneMessageQrdlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePhoneMessageQrdlResponse
     */
    public DeletePhoneMessageQrdlResponse deletePhoneMessageQrdlWithOptions(DeletePhoneMessageQrdlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qrdlCode)) {
            query.put("QrdlCode", request.qrdlCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePhoneMessageQrdl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePhoneMessageQrdlResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you delete a message QR code, users can no longer open the corresponding business phone number by scanning the original QR code. Proceed with caution.</li>
     * <li>Before calling this operation, make sure that you have a successfully created message QR code.</li>
     * <li>If you do not have a successfully created message QR code, call the <a href="https://help.aliyun.com/document_detail/2638749.html">CreatePhoneMessageQrdl</a> operation to create one first.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a message QR code.</p>
     * 
     * @param request DeletePhoneMessageQrdlRequest
     * @return DeletePhoneMessageQrdlResponse
     */
    public DeletePhoneMessageQrdlResponse deletePhoneMessageQrdl(DeletePhoneMessageQrdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePhoneMessageQrdlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the WhatsApp user name for a business phone number.</p>
     * 
     * @param request DeleteWhatsappUserNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWhatsappUserNameResponse
     */
    public DeleteWhatsappUserNameResponse deleteWhatsappUserNameWithOptions(DeleteWhatsappUserNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWhatsappUserName"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWhatsappUserNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the WhatsApp user name for a business phone number.</p>
     * 
     * @param request DeleteWhatsappUserNameRequest
     * @return DeleteWhatsappUserNameResponse
     */
    public DeleteWhatsappUserNameResponse deleteWhatsappUserName(DeleteWhatsappUserNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWhatsappUserNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deprecates a WhatsApp flow.</p>
     * 
     * @param request DeprecateFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeprecateFlowResponse
     */
    public DeprecateFlowResponse deprecateFlowWithOptions(DeprecateFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeprecateFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeprecateFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deprecates a WhatsApp flow.</p>
     * 
     * @param request DeprecateFlowRequest
     * @return DeprecateFlowResponse
     */
    public DeprecateFlowResponse deprecateFlow(DeprecateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deprecateFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you retrieve metrics for the message sending volume of WhatsApp-type channels or metrics related to Marketing-type templates by calling API operations, call this operation to enable WhatsApp ROI metric collection.</li>
     * <li>After you enable WhatsApp ROI metric collection, at least one day is required before metric data becomes available. Message sending volume metrics and Marketing-type template metrics for messages sent before the feature is enabled are not collected.</li>
     * <li>After you enable WhatsApp ROI metric collection, you can call the <a href="https://help.aliyun.com/document_detail/2557788.html">GetChatappPhoneNumberMetric</a> operation to query the sending volume metrics of a phone number, or call the <a href="https://help.aliyun.com/document_detail/2557790.html">GetChatappTemplateMetric</a> operation to query metrics related to Marketing-type templates.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables WhatsApp-related metric collection.</p>
     * 
     * @param request EnableWhatsappROIMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableWhatsappROIMetricResponse
     */
    public EnableWhatsappROIMetricResponse enableWhatsappROIMetricWithOptions(EnableWhatsappROIMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableWhatsappROIMetric"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableWhatsappROIMetricResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you retrieve metrics for the message sending volume of WhatsApp-type channels or metrics related to Marketing-type templates by calling API operations, call this operation to enable WhatsApp ROI metric collection.</li>
     * <li>After you enable WhatsApp ROI metric collection, at least one day is required before metric data becomes available. Message sending volume metrics and Marketing-type template metrics for messages sent before the feature is enabled are not collected.</li>
     * <li>After you enable WhatsApp ROI metric collection, you can call the <a href="https://help.aliyun.com/document_detail/2557788.html">GetChatappPhoneNumberMetric</a> operation to query the sending volume metrics of a phone number, or call the <a href="https://help.aliyun.com/document_detail/2557790.html">GetChatappTemplateMetric</a> operation to query metrics related to Marketing-type templates.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables WhatsApp-related metric collection.</p>
     * 
     * @param request EnableWhatsappROIMetricRequest
     * @return EnableWhatsappROIMetricResponse
     */
    public EnableWhatsappROIMetricResponse enableWhatsappROIMetric(EnableWhatsappROIMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableWhatsappROIMetricWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call this API operation to attach a phone number or a business account ID to a flow. You can also manually attach them on the <strong>Settings</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>Before you call this API operation, make sure that you have created a flow and a message channel of the corresponding type.</li>
     * <li>For a WhatsApp channel, you must have completed <a href="https://help.aliyun.com/document_detail/172335.html">WhatsApp Business Account (WABA) registration and binding</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">added a phone number</a>.</li>
     * <li>For a Messenger channel, you must have <a href="https://help.aliyun.com/document_detail/2837713.html">connected a public homepage account</a>.</li>
     * <li>For an Instagram channel, you must have <a href="https://help.aliyun.com/document_detail/2837720.html">connected a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>For a Viber channel, you must have <a href="https://help.aliyun.com/document_detail/2807995.html">requested a service number</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches a phone number or a business account ID to a flow.</p>
     * 
     * @param tmpReq FlowBindPhoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlowBindPhoneResponse
     */
    public FlowBindPhoneResponse flowBindPhoneWithOptions(FlowBindPhoneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlowBindPhoneShrinkRequest request = new FlowBindPhoneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneNumbers)) {
            request.phoneNumbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneNumbers, "PhoneNumbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelCode)) {
            query.put("ChannelCode", request.channelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbersShrink)) {
            query.put("PhoneNumbers", request.phoneNumbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlowBindPhone"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlowBindPhoneResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call this API operation to attach a phone number or a business account ID to a flow. You can also manually attach them on the <strong>Settings</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>Before you call this API operation, make sure that you have created a flow and a message channel of the corresponding type.</li>
     * <li>For a WhatsApp channel, you must have completed <a href="https://help.aliyun.com/document_detail/172335.html">WhatsApp Business Account (WABA) registration and binding</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">added a phone number</a>.</li>
     * <li>For a Messenger channel, you must have <a href="https://help.aliyun.com/document_detail/2837713.html">connected a public homepage account</a>.</li>
     * <li>For an Instagram channel, you must have <a href="https://help.aliyun.com/document_detail/2837720.html">connected a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>For a Viber channel, you must have <a href="https://help.aliyun.com/document_detail/2807995.html">requested a service number</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches a phone number or a business account ID to a flow.</p>
     * 
     * @param request FlowBindPhoneRequest
     * @return FlowBindPhoneResponse
     */
    public FlowBindPhoneResponse flowBindPhone(FlowBindPhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.flowBindPhoneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to rebind a phone number or merchant account ID to a flow that already has a binding. You can also manually rebind on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong> page.</li>
     * <li>Before calling this operation, make sure that your flow already has a phone number or merchant account ID bound to it.</li>
     * <li>If you are binding a phone number or merchant account ID to a flow for the first time, use the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rebinds a phone number or merchant account ID to a flow.</p>
     * 
     * @param tmpReq FlowRebindPhoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlowRebindPhoneResponse
     */
    public FlowRebindPhoneResponse flowRebindPhoneWithOptions(FlowRebindPhoneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlowRebindPhoneShrinkRequest request = new FlowRebindPhoneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneNumbers)) {
            request.phoneNumbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneNumbers, "PhoneNumbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelCode)) {
            query.put("ChannelCode", request.channelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbersShrink)) {
            query.put("PhoneNumbers", request.phoneNumbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlowRebindPhone"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlowRebindPhoneResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to rebind a phone number or merchant account ID to a flow that already has a binding. You can also manually rebind on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong> page.</li>
     * <li>Before calling this operation, make sure that your flow already has a phone number or merchant account ID bound to it.</li>
     * <li>If you are binding a phone number or merchant account ID to a flow for the first time, use the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rebinds a phone number or merchant account ID to a flow.</p>
     * 
     * @param request FlowRebindPhoneRequest
     * @return FlowRebindPhoneResponse
     */
    public FlowRebindPhoneResponse flowRebindPhone(FlowRebindPhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.flowRebindPhoneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that the flow is unpublished. If the flow is published, you can unpublish it manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> by clicking the flow name to open the orchestration canvas. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/2937198.html">OfflineFlowVersion</a> operation to unpublish the flow.</li>
     * <li>You can call this operation to unbind a phone number or business account ID from a flow. You can also perform this action manually on the <strong>Settings</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>Before you call this operation, ensure that a phone number or business account ID is bound to the flow.</li>
     * <li>If no phone number or business account ID is bound to the flow, you can bind one manually on the <strong>Settings</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> or call the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation.</li>
     * <li>After a phone number or business account ID is unbound from a flow, the flow cannot be published. You must bind a new phone number or business account ID to the flow before you can publish it.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a phone number or business account ID from a flow.</p>
     * 
     * @param tmpReq FlowUnbindPhoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlowUnbindPhoneResponse
     */
    public FlowUnbindPhoneResponse flowUnbindPhoneWithOptions(FlowUnbindPhoneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlowUnbindPhoneShrinkRequest request = new FlowUnbindPhoneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneNumbers)) {
            request.phoneNumbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneNumbers, "PhoneNumbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbersShrink)) {
            query.put("PhoneNumbers", request.phoneNumbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlowUnbindPhone"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlowUnbindPhoneResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that the flow is unpublished. If the flow is published, you can unpublish it manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> by clicking the flow name to open the orchestration canvas. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/2937198.html">OfflineFlowVersion</a> operation to unpublish the flow.</li>
     * <li>You can call this operation to unbind a phone number or business account ID from a flow. You can also perform this action manually on the <strong>Settings</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>Before you call this operation, ensure that a phone number or business account ID is bound to the flow.</li>
     * <li>If no phone number or business account ID is bound to the flow, you can bind one manually on the <strong>Settings</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> or call the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation.</li>
     * <li>After a phone number or business account ID is unbound from a flow, the flow cannot be published. You must bind a new phone number or business account ID to the flow before you can publish it.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a phone number or business account ID from a flow.</p>
     * 
     * @param request FlowUnbindPhoneRequest
     * @return FlowUnbindPhoneResponse
     */
    public FlowUnbindPhoneResponse flowUnbindPhone(FlowUnbindPhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.flowUnbindPhoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a temporary URL.</p>
     * 
     * @param request GeneratePresignedUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GeneratePresignedUrlResponse
     */
    public GeneratePresignedUrlResponse generatePresignedUrlWithOptions(GeneratePresignedUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GeneratePresignedUrl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GeneratePresignedUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a temporary URL.</p>
     * 
     * @param request GeneratePresignedUrlRequest
     * @return GeneratePresignedUrlResponse
     */
    public GeneratePresignedUrlResponse generatePresignedUrl(GeneratePresignedUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generatePresignedUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过类型查询出个人待审核的单子</p>
     * 
     * @param request GetAuditRequestByTypeUnAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuditRequestByTypeUnAuditResponse
     */
    public GetAuditRequestByTypeUnAuditResponse getAuditRequestByTypeUnAuditWithOptions(GetAuditRequestByTypeUnAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestType)) {
            query.put("RequestType", request.requestType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuditRequestByTypeUnAudit"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuditRequestByTypeUnAuditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过类型查询出个人待审核的单子</p>
     * 
     * @param request GetAuditRequestByTypeUnAuditRequest
     * @return GetAuditRequestByTypeUnAuditResponse
     */
    public GetAuditRequestByTypeUnAuditResponse getAuditRequestByTypeUnAudit(GetAuditRequestByTypeUnAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuditRequestByTypeUnAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves auto-generated templates.</p>
     * 
     * @param request GetAutoGeneratedTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoGeneratedTemplateResponse
     */
    public GetAutoGeneratedTemplateResponse getAutoGeneratedTemplateWithOptions(GetAutoGeneratedTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoGeneratedTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoGeneratedTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves auto-generated templates.</p>
     * 
     * @param request GetAutoGeneratedTemplateRequest
     * @return GetAutoGeneratedTemplateResponse
     */
    public GetAutoGeneratedTemplateResponse getAutoGeneratedTemplate(GetAutoGeneratedTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoGeneratedTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that the flow you created is online and has been triggered.</li>
     * <li>If your flow is not online, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page, click the flow name to open the canvas, and manually bring the flow online. Alternatively, call the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> operation to bring the flow online.</li>
     * <li>For flows with a manual trigger type, call the <a href="https://help.aliyun.com/document_detail/2859101.html">TriggerChatFlow</a> operation to trigger the flow, or go to the <a href="https://chatapp.console.aliyun.com/MarketingActivityManagement">Marketing Activity Management</a> page and trigger the flow by associating it with a campaign.</li>
     * <li>For flows with a non-manual trigger type, you do not need to manually trigger the flow. The flow is automatically triggered when a message is sent to the bound business account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves ChatFlow runtime data.</p>
     * 
     * @param tmpReq GetChatFlowMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatFlowMetricResponse
     */
    public GetChatFlowMetricResponse getChatFlowMetricWithOptions(GetChatFlowMetricRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetChatFlowMetricShrinkRequest request = new GetChatFlowMetricShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metricParam)) {
            request.metricParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metricParam, "MetricParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricParamShrink)) {
            query.put("MetricParam", request.metricParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatFlowMetric"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatFlowMetricResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that the flow you created is online and has been triggered.</li>
     * <li>If your flow is not online, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page, click the flow name to open the canvas, and manually bring the flow online. Alternatively, call the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> operation to bring the flow online.</li>
     * <li>For flows with a manual trigger type, call the <a href="https://help.aliyun.com/document_detail/2859101.html">TriggerChatFlow</a> operation to trigger the flow, or go to the <a href="https://chatapp.console.aliyun.com/MarketingActivityManagement">Marketing Activity Management</a> page and trigger the flow by associating it with a campaign.</li>
     * <li>For flows with a non-manual trigger type, you do not need to manually trigger the flow. The flow is automatically triggered when a message is sent to the bound business account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves ChatFlow runtime data.</p>
     * 
     * @param request GetChatFlowMetricRequest
     * @return GetChatFlowMetricResponse
     */
    public GetChatFlowMetricResponse getChatFlowMetric(GetChatFlowMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatFlowMetricWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the details of a flow template. You can also go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> &gt; <strong>View Templates</strong> page and click a template name to view its details.</li>
     * <li>After you view the details of a template on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> &gt; <strong>View Templates</strong> page, you can use the template to create a flow.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a flow template.</p>
     * 
     * @param request GetChatFlowTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatFlowTemplateResponse
     */
    public GetChatFlowTemplateResponse getChatFlowTemplateWithOptions(GetChatFlowTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatFlowTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatFlowTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the details of a flow template. You can also go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> &gt; <strong>View Templates</strong> page and click a template name to view its details.</li>
     * <li>After you view the details of a template on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> &gt; <strong>View Templates</strong> page, you can use the template to create a flow.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a flow template.</p>
     * 
     * @param request GetChatFlowTemplateRequest
     * @return GetChatFlowTemplateResponse
     */
    public GetChatFlowTemplateResponse getChatFlowTemplate(GetChatFlowTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatFlowTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the activation status of ChatApp.</p>
     * 
     * @param request GetChatappOpenStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatappOpenStatusResponse
     */
    public GetChatappOpenStatusResponse getChatappOpenStatusWithOptions(GetChatappOpenStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappOpenStatus"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappOpenStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the activation status of ChatApp.</p>
     * 
     * @param request GetChatappOpenStatusRequest
     * @return GetChatappOpenStatusResponse
     */
    public GetChatappOpenStatusResponse getChatappOpenStatus(GetChatappOpenStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappOpenStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can only query the sending volume metrics for phone numbers on WhatsApp channels.</li>
     * <li>You can call this operation to query phone number sending volume metrics, or view them in the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channels Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channels Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Customer Statistics Daily Report</strong> page.</li>
     * <li>Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/2557789.html">EnableWhatsAppROIMetric</a> operation to enable WhatsApp ROI metric collection. After enabling, at least one day is required before statistics become available. Message sending volume metrics for messages sent before enabling are not collected.</li>
     * <li>After enabling WhatsApp ROI metric collection, ensure that your channel has successfully sent messages. You can send messages on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channels Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channels Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Send Message</strong> page, or by calling the <a href="https://help.aliyun.com/document_detail/432208.html">SendChatappMessage</a> or <a href="https://help.aliyun.com/document_detail/447926.html">SendChatappMassMessage</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. Requests that exceed this limit are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the message sending volume metrics for a WhatsApp channel phone number.</p>
     * 
     * @param request GetChatappPhoneNumberMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatappPhoneNumberMetricResponse
     */
    public GetChatappPhoneNumberMetricResponse getChatappPhoneNumberMetricWithOptions(GetChatappPhoneNumberMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappPhoneNumberMetric"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappPhoneNumberMetricResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can only query the sending volume metrics for phone numbers on WhatsApp channels.</li>
     * <li>You can call this operation to query phone number sending volume metrics, or view them in the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channels Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channels Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Customer Statistics Daily Report</strong> page.</li>
     * <li>Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/2557789.html">EnableWhatsAppROIMetric</a> operation to enable WhatsApp ROI metric collection. After enabling, at least one day is required before statistics become available. Message sending volume metrics for messages sent before enabling are not collected.</li>
     * <li>After enabling WhatsApp ROI metric collection, ensure that your channel has successfully sent messages. You can send messages on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channels Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channels Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Send Message</strong> page, or by calling the <a href="https://help.aliyun.com/document_detail/432208.html">SendChatappMessage</a> or <a href="https://help.aliyun.com/document_detail/447926.html">SendChatappMassMessage</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. Requests that exceed this limit are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the message sending volume metrics for a WhatsApp channel phone number.</p>
     * 
     * @param request GetChatappPhoneNumberMetricRequest
     * @return GetChatappPhoneNumberMetricResponse
     */
    public GetChatappPhoneNumberMetricResponse getChatappPhoneNumberMetric(GetChatappPhoneNumberMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappPhoneNumberMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves other controls for a ChatApp phone number.</p>
     * 
     * @param request GetChatappPhoneNumberSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatappPhoneNumberSettingResponse
     */
    public GetChatappPhoneNumberSettingResponse getChatappPhoneNumberSettingWithOptions(GetChatappPhoneNumberSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappPhoneNumberSetting"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappPhoneNumberSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves other controls for a ChatApp phone number.</p>
     * 
     * @param request GetChatappPhoneNumberSettingRequest
     * @return GetChatappPhoneNumberSettingResponse
     */
    public GetChatappPhoneNumberSettingResponse getChatappPhoneNumberSetting(GetChatappPhoneNumberSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappPhoneNumberSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a Chat App Message Service message template.</p>
     * 
     * @param request GetChatappTemplateDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatappTemplateDetailResponse
     */
    public GetChatappTemplateDetailResponse getChatappTemplateDetailWithOptions(GetChatappTemplateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappTemplateDetail"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappTemplateDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a Chat App Message Service message template.</p>
     * 
     * @param request GetChatappTemplateDetailRequest
     * @return GetChatappTemplateDetailResponse
     */
    public GetChatappTemplateDetailResponse getChatappTemplateDetail(GetChatappTemplateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappTemplateDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can only query metrics for marketing templates of WhatsApp channels.</li>
     * <li>Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/2557789.html">EnableWhatsAppROIMetric</a> operation to enable WhatsApp ROI metric collection. After enabling, statistical data requires at least one day to become available. Metrics for marketing templates sent before enabling are not collected.</li>
     * <li>After enabling WhatsApp ROI metric collection, make sure that the marketing templates of your created channels have successfully sent messages. You can send messages on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Send Message</strong> page, or by calling the <a href="https://help.aliyun.com/document_detail/432208.html">SendChatappMessage</a> or <a href="https://help.aliyun.com/document_detail/447926.html">SendChatappMassMessage</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. Requests that exceed this limit are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves metrics related to marketing-type templates.</p>
     * 
     * @param request GetChatappTemplateMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatappTemplateMetricResponse
     */
    public GetChatappTemplateMetricResponse getChatappTemplateMetricWithOptions(GetChatappTemplateMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappTemplateMetric"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappTemplateMetricResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can only query metrics for marketing templates of WhatsApp channels.</li>
     * <li>Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/2557789.html">EnableWhatsAppROIMetric</a> operation to enable WhatsApp ROI metric collection. After enabling, statistical data requires at least one day to become available. Metrics for marketing templates sent before enabling are not collected.</li>
     * <li>After enabling WhatsApp ROI metric collection, make sure that the marketing templates of your created channels have successfully sent messages. You can send messages on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Send Message</strong> page, or by calling the <a href="https://help.aliyun.com/document_detail/432208.html">SendChatappMessage</a> or <a href="https://help.aliyun.com/document_detail/447926.html">SendChatappMassMessage</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. Requests that exceed this limit are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves metrics related to marketing-type templates.</p>
     * 
     * @param request GetChatappTemplateMetricRequest
     * @return GetChatappTemplateMetricResponse
     */
    public GetChatappTemplateMetricResponse getChatappTemplateMetric(GetChatappTemplateMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappTemplateMetricWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the authentication information that is used to upload a file.</p>
     * 
     * @param request GetChatappUploadAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatappUploadAuthorizationResponse
     */
    public GetChatappUploadAuthorizationResponse getChatappUploadAuthorizationWithOptions(GetChatappUploadAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappUploadAuthorization"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappUploadAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the authentication information that is used to upload a file.</p>
     * 
     * @param request GetChatappUploadAuthorizationRequest
     * @return GetChatappUploadAuthorizationResponse
     */
    public GetChatappUploadAuthorizationResponse getChatappUploadAuthorization(GetChatappUploadAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappUploadAuthorizationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Requests a verification code to be sent to the specified phone number.</p>
     * 
     * @param request GetChatappVerifyCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatappVerifyCodeResponse
     */
    public GetChatappVerifyCodeResponse getChatappVerifyCodeWithOptions(GetChatappVerifyCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappVerifyCode"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappVerifyCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Requests a verification code to be sent to the specified phone number.</p>
     * 
     * @param request GetChatappVerifyCodeRequest
     * @return GetChatappVerifyCodeResponse
     */
    public GetChatappVerifyCodeResponse getChatappVerifyCode(GetChatappVerifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatappVerifyCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the business settings of a phone number.</p>
     * 
     * @param request GetCommerceSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCommerceSettingResponse
     */
    public GetCommerceSettingResponse getCommerceSettingWithOptions(GetCommerceSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCommerceSetting"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCommerceSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the business settings of a phone number.</p>
     * 
     * @param request GetCommerceSettingRequest
     * @return GetCommerceSettingResponse
     */
    public GetCommerceSettingResponse getCommerceSetting(GetCommerceSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCommerceSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.
     * This operation retrieves data directly from Meta. Meta imposes its own rate limits on the total number of calls. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the conversational automation settings for a phone number.</p>
     * 
     * @param request GetConversationalAutomationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConversationalAutomationResponse
     */
    public GetConversationalAutomationResponse getConversationalAutomationWithOptions(GetConversationalAutomationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConversationalAutomation"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConversationalAutomationResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.
     * This operation retrieves data directly from Meta. Meta imposes its own rate limits on the total number of calls. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the conversational automation settings for a phone number.</p>
     * 
     * @param request GetConversationalAutomationRequest
     * @return GetConversationalAutomationResponse
     */
    public GetConversationalAutomationResponse getConversationalAutomation(GetConversationalAutomationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConversationalAutomationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the source site of a customer.</p>
     * 
     * @param request GetCustomerSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerSiteResponse
     */
    public GetCustomerSiteResponse getCustomerSiteWithOptions(GetCustomerSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerSite"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerSiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the source site of a customer.</p>
     * 
     * @param request GetCustomerSiteRequest
     * @return GetCustomerSiteResponse
     */
    public GetCustomerSiteResponse getCustomerSite(GetCustomerSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerSiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载excel数据</p>
     * 
     * @param tmpReq GetDownloadExcelListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDownloadExcelListResponse
     */
    public GetDownloadExcelListResponse getDownloadExcelListWithOptions(GetDownloadExcelListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDownloadExcelListShrinkRequest request = new GetDownloadExcelListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.countryNames)) {
            request.countryNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.countryNames, "CountryNames", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryNamesShrink)) {
            query.put("CountryNames", request.countryNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIdsShrink)) {
            query.put("GroupIds", request.groupIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDownloadExcelList"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDownloadExcelListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载excel数据</p>
     * 
     * @param request GetDownloadExcelListRequest
     * @return GetDownloadExcelListResponse
     */
    public GetDownloadExcelListResponse getDownloadExcelList(GetDownloadExcelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDownloadExcelListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ins的page列表</p>
     * 
     * @param request GetFbInstagramPagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFbInstagramPagesResponse
     */
    public GetFbInstagramPagesResponse getFbInstagramPagesWithOptions(GetFbInstagramPagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFbInstagramPages"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFbInstagramPagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ins的page列表</p>
     * 
     * @param request GetFbInstagramPagesRequest
     * @return GetFbInstagramPagesResponse
     */
    public GetFbInstagramPagesResponse getFbInstagramPages(GetFbInstagramPagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFbInstagramPagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取facebook的pageId列表</p>
     * 
     * @param request GetFbMessengerPagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFbMessengerPagesResponse
     */
    public GetFbMessengerPagesResponse getFbMessengerPagesWithOptions(GetFbMessengerPagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFbMessengerPages"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFbMessengerPagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取facebook的pageId列表</p>
     * 
     * @param request GetFbMessengerPagesRequest
     * @return GetFbMessengerPagesResponse
     */
    public GetFbMessengerPagesResponse getFbMessengerPages(GetFbMessengerPagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFbMessengerPagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have created a WhatsApp flow.</li>
     * <li>If you have not created a WhatsApp flow, call the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> API to create one.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a WhatsApp flow, including its status, name, categories, and preview URL.</p>
     * 
     * @param request GetFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowResponse
     */
    public GetFlowResponse getFlowWithOptions(GetFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have created a WhatsApp flow.</li>
     * <li>If you have not created a WhatsApp flow, call the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> API to create one.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a WhatsApp flow, including its status, name, categories, and preview URL.</p>
     * 
     * @param request GetFlowRequest
     * @return GetFlowResponse
     */
    public GetFlowResponse getFlow(GetFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have created a WhatsApp flow.</li>
     * <li>If you have not created a WhatsApp flow, call the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> API to create one.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the JSON content of a WhatsApp flow.</p>
     * 
     * @param request GetFlowJSONAssestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowJSONAssestResponse
     */
    public GetFlowJSONAssestResponse getFlowJSONAssestWithOptions(GetFlowJSONAssestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowJSONAssest"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowJSONAssestResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have created a WhatsApp flow.</li>
     * <li>If you have not created a WhatsApp flow, call the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> API to create one.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the JSON content of a WhatsApp flow.</p>
     * 
     * @param request GetFlowJSONAssestRequest
     * @return GetFlowJSONAssestResponse
     */
    public GetFlowJSONAssestResponse getFlowJSONAssest(GetFlowJSONAssestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowJSONAssestWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you create a WhatsApp flow, call this operation to generate a temporary preview URL for the flow.</li>
     * <li>Before you call this operation, make sure that you have created a WhatsApp flow.</li>
     * <li>If you do not have a WhatsApp flow, you can call the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> API to create one.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a temporary preview URL for a WhatsApp flow.</p>
     * 
     * @param request GetFlowPreviewUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowPreviewUrlResponse
     */
    public GetFlowPreviewUrlResponse getFlowPreviewUrlWithOptions(GetFlowPreviewUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowPreviewUrl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowPreviewUrlResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you create a WhatsApp flow, call this operation to generate a temporary preview URL for the flow.</li>
     * <li>Before you call this operation, make sure that you have created a WhatsApp flow.</li>
     * <li>If you do not have a WhatsApp flow, you can call the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> API to create one.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a temporary preview URL for a WhatsApp flow.</p>
     * 
     * @param request GetFlowPreviewUrlRequest
     * @return GetFlowPreviewUrlResponse
     */
    public GetFlowPreviewUrlResponse getFlowPreviewUrl(GetFlowPreviewUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowPreviewUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群组是否重名</p>
     * 
     * @param tmpReq GetGroupExistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupExistResponse
     */
    public GetGroupExistResponse getGroupExistWithOptions(GetGroupExistRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetGroupExistShrinkRequest request = new GetGroupExistShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroupExist"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupExistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群组是否重名</p>
     * 
     * @param request GetGroupExistRequest
     * @return GetGroupExistResponse
     */
    public GetGroupExistResponse getGroupExist(GetGroupExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGroupExistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves campaign metrics.</p>
     * 
     * @param request GetMessageCampaignInsightsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMessageCampaignInsightsResponse
     */
    public GetMessageCampaignInsightsResponse getMessageCampaignInsightsWithOptions(GetMessageCampaignInsightsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessageCampaignInsights"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageCampaignInsightsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves campaign metrics.</p>
     * 
     * @param request GetMessageCampaignInsightsRequest
     * @return GetMessageCampaignInsightsResponse
     */
    public GetMessageCampaignInsightsResponse getMessageCampaignInsights(GetMessageCampaignInsightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessageCampaignInsightsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Adjust your call frequency accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the verification code for a migration phone number.</p>
     * 
     * @param request GetMigrationVerifyCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMigrationVerifyCodeResponse
     */
    public GetMigrationVerifyCodeResponse getMigrationVerifyCodeWithOptions(GetMigrationVerifyCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMigrationVerifyCode"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMigrationVerifyCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Adjust your call frequency accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the verification code for a migration phone number.</p>
     * 
     * @param request GetMigrationVerifyCodeRequest
     * @return GetMigrationVerifyCodeResponse
     */
    public GetMigrationVerifyCodeResponse getMigrationVerifyCode(GetMigrationVerifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMigrationVerifyCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains authorization permissions by using the code obtained from the embedded integration.</p>
     * 
     * @param tmpReq GetPermissionByCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPermissionByCodeResponse
     */
    public GetPermissionByCodeResponse getPermissionByCodeWithOptions(GetPermissionByCodeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPermissionByCodeShrinkRequest request = new GetPermissionByCodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.permissions)) {
            request.permissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.permissions, "Permissions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionsShrink)) {
            query.put("Permissions", request.permissionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPermissionByCode"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPermissionByCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains authorization permissions by using the code obtained from the embedded integration.</p>
     * 
     * @param request GetPermissionByCodeRequest
     * @return GetPermissionByCodeResponse
     */
    public GetPermissionByCodeResponse getPermissionByCode(GetPermissionByCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermissionByCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that a phone number has been added under your WABA and has passed phone number verification.</li>
     * <li>If no phone number has been added under your WABA, call the <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> operations to obtain a verification code and register the phone number.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the encryption public key of a phone number.</p>
     * 
     * @param request GetPhoneEncryptionPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhoneEncryptionPublicKeyResponse
     */
    public GetPhoneEncryptionPublicKeyResponse getPhoneEncryptionPublicKeyWithOptions(GetPhoneEncryptionPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhoneEncryptionPublicKey"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhoneEncryptionPublicKeyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that a phone number has been added under your WABA and has passed phone number verification.</li>
     * <li>If no phone number has been added under your WABA, call the <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> operations to obtain a verification code and register the phone number.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the encryption public key of a phone number.</p>
     * 
     * @param request GetPhoneEncryptionPublicKeyRequest
     * @return GetPhoneEncryptionPublicKeyResponse
     */
    public GetPhoneEncryptionPublicKeyResponse getPhoneEncryptionPublicKey(GetPhoneEncryptionPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhoneEncryptionPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to retrieve the verification status of a phone number. You can also view the status on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Phone Number Management</strong> page.</li>
     * <li>Before calling this operation, add a phone number to your WhatsApp Business Account (WABA) and submit it for verification.</li>
     * <li>If you have not added a phone number to your WABA, call the <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> APIs to obtain a verification code and register the number.
     * This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the verification status of a phone number.</p>
     * 
     * @param request GetPhoneNumberVerificationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhoneNumberVerificationStatusResponse
     */
    public GetPhoneNumberVerificationStatusResponse getPhoneNumberVerificationStatusWithOptions(GetPhoneNumberVerificationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhoneNumberVerificationStatus"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhoneNumberVerificationStatusResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to retrieve the verification status of a phone number. You can also view the status on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Phone Number Management</strong> page.</li>
     * <li>Before calling this operation, add a phone number to your WhatsApp Business Account (WABA) and submit it for verification.</li>
     * <li>If you have not added a phone number to your WABA, call the <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> APIs to obtain a verification code and register the number.
     * This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the verification status of a phone number.</p>
     * 
     * @param request GetPhoneNumberVerificationStatusRequest
     * @return GetPhoneNumberVerificationStatusResponse
     */
    public GetPhoneNumberVerificationStatusResponse getPhoneNumberVerificationStatus(GetPhoneNumberVerificationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhoneNumberVerificationStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the download URL for the letter of guarantee template.</p>
     * 
     * @param request GetPledgeTemplateAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPledgeTemplateAddressResponse
     */
    public GetPledgeTemplateAddressResponse getPledgeTemplateAddressWithOptions(GetPledgeTemplateAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industryType)) {
            query.put("IndustryType", request.industryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPledgeTemplateAddress"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPledgeTemplateAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the download URL for the letter of guarantee template.</p>
     * 
     * @param request GetPledgeTemplateAddressRequest
     * @return GetPledgeTemplateAddressResponse
     */
    public GetPledgeTemplateAddressResponse getPledgeTemplateAddress(GetPledgeTemplateAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPledgeTemplateAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the ID for a pre-validated phone number. Use this ID to select the number in the Embedded Signup flow without obtaining a new verification code.</p>
     * 
     * @param request GetPreValidatePhoneIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPreValidatePhoneIdResponse
     */
    public GetPreValidatePhoneIdResponse getPreValidatePhoneIdWithOptions(GetPreValidatePhoneIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            body.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPreValidatePhoneId"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPreValidatePhoneIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the ID for a pre-validated phone number. Use this ID to select the number in the Embedded Signup flow without obtaining a new verification code.</p>
     * 
     * @param request GetPreValidatePhoneIdRequest
     * @return GetPreValidatePhoneIdResponse
     */
    public GetPreValidatePhoneIdResponse getPreValidatePhoneId(GetPreValidatePhoneIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPreValidatePhoneIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the application by its requestNo.</p>
     * 
     * @param request GetViberByRequestNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetViberByRequestNoResponse
     */
    public GetViberByRequestNoResponse getViberByRequestNoWithOptions(GetViberByRequestNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestNo)) {
            query.put("RequestNo", request.requestNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetViberByRequestNo"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetViberByRequestNoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the application by its requestNo.</p>
     * 
     * @param request GetViberByRequestNoRequest
     * @return GetViberByRequestNoResponse
     */
    public GetViberByRequestNoResponse getViberByRequestNo(GetViberByRequestNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getViberByRequestNoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>可以申请暂停的次数</p>
     * 
     * @param request GetViberPauseTimesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetViberPauseTimesResponse
     */
    public GetViberPauseTimesResponse getViberPauseTimesWithOptions(GetViberPauseTimesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetViberPauseTimes"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetViberPauseTimesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>可以申请暂停的次数</p>
     * 
     * @param request GetViberPauseTimesRequest
     * @return GetViberPauseTimesResponse
     */
    public GetViberPauseTimesResponse getViberPauseTimes(GetViberPauseTimesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getViberPauseTimesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the product catalogs that are associated with a WhatsApp Business account (WABA).</p>
     * 
     * @param request GetWhatsappConnectionCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWhatsappConnectionCatalogResponse
     */
    public GetWhatsappConnectionCatalogResponse getWhatsappConnectionCatalogWithOptions(GetWhatsappConnectionCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWhatsappConnectionCatalog"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWhatsappConnectionCatalogResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the product catalogs that are associated with a WhatsApp Business account (WABA).</p>
     * 
     * @param request GetWhatsappConnectionCatalogRequest
     * @return GetWhatsappConnectionCatalogResponse
     */
    public GetWhatsappConnectionCatalogResponse getWhatsappConnectionCatalog(GetWhatsappConnectionCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWhatsappConnectionCatalogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取嵌入式授权page</p>
     * 
     * @param request GetWhatsappConversionApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWhatsappConversionApiResponse
     */
    public GetWhatsappConversionApiResponse getWhatsappConversionApiWithOptions(GetWhatsappConversionApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWhatsappConversionApi"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWhatsappConversionApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取嵌入式授权page</p>
     * 
     * @param request GetWhatsappConversionApiRequest
     * @return GetWhatsappConversionApiResponse
     */
    public GetWhatsappConversionApiResponse getWhatsappConversionApi(GetWhatsappConversionApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWhatsappConversionApiWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.
     * This operation retrieves data directly from Meta. Meta imposes its own rate limits on the total number of calls. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the messaging health status of different types of nodes.</p>
     * 
     * @param request GetWhatsappHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWhatsappHealthStatusResponse
     */
    public GetWhatsappHealthStatusResponse getWhatsappHealthStatusWithOptions(GetWhatsappHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("NodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWhatsappHealthStatus"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWhatsappHealthStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.
     * This operation retrieves data directly from Meta. Meta imposes its own rate limits on the total number of calls. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the messaging health status of different types of nodes.</p>
     * 
     * @param request GetWhatsappHealthStatusRequest
     * @return GetWhatsappHealthStatusResponse
     */
    public GetWhatsappHealthStatusResponse getWhatsappHealthStatus(GetWhatsappHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWhatsappHealthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the WhatsApp username for a business phone number.</p>
     * 
     * @param request GetWhatsappUserNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWhatsappUserNameResponse
     */
    public GetWhatsappUserNameResponse getWhatsappUserNameWithOptions(GetWhatsappUserNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWhatsappUserName"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWhatsappUserNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the WhatsApp username for a business phone number.</p>
     * 
     * @param request GetWhatsappUserNameRequest
     * @return GetWhatsappUserNameResponse
     */
    public GetWhatsappUserNameResponse getWhatsappUserName(GetWhatsappUserNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWhatsappUserNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the suggested user name for a WhatsApp business phone number.</p>
     * 
     * @param request GetWhatsappUserNameSuggestionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWhatsappUserNameSuggestionsResponse
     */
    public GetWhatsappUserNameSuggestionsResponse getWhatsappUserNameSuggestionsWithOptions(GetWhatsappUserNameSuggestionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWhatsappUserNameSuggestions"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWhatsappUserNameSuggestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the suggested user name for a WhatsApp business phone number.</p>
     * 
     * @param request GetWhatsappUserNameSuggestionsRequest
     * @return GetWhatsappUserNameSuggestionsResponse
     */
    public GetWhatsappUserNameSuggestionsResponse getWhatsappUserNameSuggestions(GetWhatsappUserNameSuggestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWhatsappUserNameSuggestionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The QPS limit for a single user of this API is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the App ID for an ISV.</p>
     * 
     * @param request IsvGetAppIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IsvGetAppIdResponse
     */
    public IsvGetAppIdResponse isvGetAppIdWithOptions(IsvGetAppIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.intlVersion)) {
            query.put("IntlVersion", request.intlVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissions)) {
            query.put("Permissions", request.permissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsvGetAppId"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsvGetAppIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>The QPS limit for a single user of this API is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the App ID for an ISV.</p>
     * 
     * @param request IsvGetAppIdRequest
     * @return IsvGetAppIdResponse
     */
    public IsvGetAppIdResponse isvGetAppId(IsvGetAppIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.isvGetAppIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询群组列表</p>
     * 
     * @param tmpReq ListAllGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllGroupsResponse
     */
    public ListAllGroupsResponse listAllGroupsWithOptions(ListAllGroupsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAllGroupsShrinkRequest request = new ListAllGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllGroups"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询群组列表</p>
     * 
     * @param request ListAllGroupsRequest
     * @return ListAllGroupsResponse
     */
    public ListAllGroupsResponse listAllGroups(ListAllGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询绑定的dm账号</p>
     * 
     * @param request ListBindDmAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBindDmAccountResponse
     */
    public ListBindDmAccountResponse listBindDmAccountWithOptions(ListBindDmAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindDmAccount"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindDmAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询绑定的dm账号</p>
     * 
     * @param request ListBindDmAccountRequest
     * @return ListBindDmAccountResponse
     */
    public ListBindDmAccountResponse listBindDmAccount(ListBindDmAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBindDmAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the phone numbers or business account IDs attached to a flow. You can also view this information on the <strong>Settings</strong> page in the <strong>Flow Editor</strong>.</li>
     * <li>Before you call this operation, ensure that a phone number or business account ID is attached to your flow.</li>
     * <li>If a phone number or business account ID is not attached to your flow, you can attach one manually on the <strong>Settings</strong> page in the <strong>Flow Editor</strong> or by calling the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the phone numbers or business account IDs attached to a flow.</p>
     * 
     * @param request ListBindingRelationsForFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBindingRelationsForFlowVersionResponse
     */
    public ListBindingRelationsForFlowVersionResponse listBindingRelationsForFlowVersionWithOptions(ListBindingRelationsForFlowVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindingRelationsForFlowVersion"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindingRelationsForFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the phone numbers or business account IDs attached to a flow. You can also view this information on the <strong>Settings</strong> page in the <strong>Flow Editor</strong>.</li>
     * <li>Before you call this operation, ensure that a phone number or business account ID is attached to your flow.</li>
     * <li>If a phone number or business account ID is not attached to your flow, you can attach one manually on the <strong>Settings</strong> page in the <strong>Flow Editor</strong> or by calling the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the phone numbers or business account IDs attached to a flow.</p>
     * 
     * @param request ListBindingRelationsForFlowVersionRequest
     * @return ListBindingRelationsForFlowVersionResponse
     */
    public ListBindingRelationsForFlowVersionResponse listBindingRelationsForFlowVersion(ListBindingRelationsForFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBindingRelationsForFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query flows, or manually query flows in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> console.</li>
     * <li>Before calling this operation, make sure that you have successfully created flows.</li>
     * <li>If you do not have any successfully created flows, manually create a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> console or call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation to create a flow.</li>
     * <li>The optional parameters in this operation are filter conditions for querying flows. If you do not specify these parameters, all flows are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists flows.</p>
     * 
     * @param tmpReq ListChatFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatFlowResponse
     */
    public ListChatFlowResponse listChatFlowWithOptions(ListChatFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChatFlowShrinkRequest request = new ListChatFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowTriggerType)) {
            query.put("FlowTriggerType", request.flowTriggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnWithOnlineVersion)) {
            query.put("ReturnWithOnlineVersion", request.returnWithOnlineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query flows, or manually query flows in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> console.</li>
     * <li>Before calling this operation, make sure that you have successfully created flows.</li>
     * <li>If you do not have any successfully created flows, manually create a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> console or call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation to create a flow.</li>
     * <li>The optional parameters in this operation are filter conditions for querying flows. If you do not specify these parameters, all flows are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists flows.</p>
     * 
     * @param request ListChatFlowRequest
     * @return ListChatFlowResponse
     */
    public ListChatFlowResponse listChatFlow(ListChatFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to list flow templates. You can also view the list of templates on the <strong>View Templates</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>You can use the optional parameters in this operation to filter the list of templates. If you do not specify any filter conditions, all templates are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists flow templates.</p>
     * 
     * @param request ListChatFlowTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatFlowTemplateResponse
     */
    public ListChatFlowTemplateResponse listChatFlowTemplateWithOptions(ListChatFlowTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatFlowTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatFlowTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to list flow templates. You can also view the list of templates on the <strong>View Templates</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>You can use the optional parameters in this operation to filter the list of templates. If you do not specify any filter conditions, all templates are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists flow templates.</p>
     * 
     * @param request ListChatFlowTemplateRequest
     * @return ListChatFlowTemplateResponse
     */
    public ListChatFlowTemplateResponse listChatFlowTemplate(ListChatFlowTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatFlowTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The feature of retrieving IM group lists through API is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure you have successfully created IM groups.</li>
     * <li>If you do not have any created IM groups, you can only create IM groups through the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation.</li>
     * <li>The optional parameters of this operation are filter conditions for the IM group list. If you do not specify them, all IM groups are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of IM groups.</p>
     * 
     * @param tmpReq ListChatGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatGroupResponse
     */
    public ListChatGroupResponse listChatGroupWithOptions(ListChatGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChatGroupShrinkRequest request = new ListChatGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupLink)) {
            query.put("GroupLink", request.groupLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupStatus)) {
            query.put("GroupStatus", request.groupStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatGroup"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The feature of retrieving IM group lists through API is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure you have successfully created IM groups.</li>
     * <li>If you do not have any created IM groups, you can only create IM groups through the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation.</li>
     * <li>The optional parameters of this operation are filter conditions for the IM group list. If you do not specify them, all IM groups are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of IM groups.</p>
     * 
     * @param request ListChatGroupRequest
     * @return ListChatGroupResponse
     */
    public ListChatGroupResponse listChatGroup(ListChatGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This operation is an internal preview feature. Contact your account manager to request access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, ensure you have created an IM group with an invitation link, and that members have joined by using that link.</li>
     * <li>To create an IM group and add an invitation link, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the members of an IM group.</p>
     * 
     * @param tmpReq ListChatGroupParticipantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatGroupParticipantsResponse
     */
    public ListChatGroupParticipantsResponse listChatGroupParticipantsWithOptions(ListChatGroupParticipantsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChatGroupParticipantsShrinkRequest request = new ListChatGroupParticipantsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatGroupParticipants"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatGroupParticipantsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This operation is an internal preview feature. Contact your account manager to request access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, ensure you have created an IM group with an invitation link, and that members have joined by using that link.</li>
     * <li>To create an IM group and add an invitation link, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the members of an IM group.</p>
     * 
     * @param request ListChatGroupParticipantsRequest
     * @return ListChatGroupParticipantsResponse
     */
    public ListChatGroupParticipantsResponse listChatGroupParticipants(ListChatGroupParticipantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatGroupParticipantsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the message list. You can also view the message list in the <a href="https://chatapp.console.aliyun.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Message List</strong> console.</li>
     * <li>This operation only supports querying the message list for WhatsApp&lt;props=&quot;intl&quot;&gt; and Viber channel types.</li>
     * <li>Before calling this operation, make sure that you have created a WhatsApp&lt;props=&quot;intl&quot;&gt; or Viber channel, bound a phone number or merchant account ID, created a template that has passed the review, and sent messages through the channel.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the message list.</p>
     * 
     * @param tmpReq ListChatappMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatappMessageResponse
     */
    public ListChatappMessageResponse listChatappMessageWithOptions(ListChatappMessageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChatappMessageShrinkRequest request = new ListChatappMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientAcceptStatus)) {
            query.put("ClientAcceptStatus", request.clientAcceptStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeStr)) {
            query.put("EndTimeStr", request.endTimeStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventAction)) {
            query.put("EventAction", request.eventAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupMessageId)) {
            query.put("GroupMessageId", request.groupMessageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageStatus)) {
            query.put("MessageStatus", request.messageStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeStr)) {
            query.put("StartTimeStr", request.startTimeStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNumber)) {
            query.put("UserNumber", request.userNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatappMessage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatappMessageResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the message list. You can also view the message list in the <a href="https://chatapp.console.aliyun.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Message List</strong> console.</li>
     * <li>This operation only supports querying the message list for WhatsApp&lt;props=&quot;intl&quot;&gt; and Viber channel types.</li>
     * <li>Before calling this operation, make sure that you have created a WhatsApp&lt;props=&quot;intl&quot;&gt; or Viber channel, bound a phone number or merchant account ID, created a template that has passed the review, and sent messages through the channel.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the message list.</p>
     * 
     * @param request ListChatappMessageRequest
     * @return ListChatappMessageResponse
     */
    public ListChatappMessageResponse listChatappMessage(ListChatappMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatappMessageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries message templates.</p>
     * 
     * @param tmpReq ListChatappTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatappTemplateResponse
     */
    public ListChatappTemplateResponse listChatappTemplateWithOptions(ListChatappTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChatappTemplateShrinkRequest request = new ListChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatappTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries message templates.</p>
     * 
     * @param request ListChatappTemplateRequest
     * @return ListChatappTemplateResponse
     */
    public ListChatappTemplateResponse listChatappTemplate(ListChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatappTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom audiences.</p>
     * 
     * @param tmpReq ListCustomAudienceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomAudienceResponse
     */
    public ListCustomAudienceResponse listCustomAudienceWithOptions(ListCustomAudienceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCustomAudienceShrinkRequest request = new ListCustomAudienceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAudienceId)) {
            query.put("CustomAudienceId", request.customAudienceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAudienceName)) {
            query.put("CustomAudienceName", request.customAudienceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenType)) {
            query.put("TokenType", request.tokenType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomAudience"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomAudienceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom audiences.</p>
     * 
     * @param request ListCustomAudienceRequest
     * @return ListCustomAudienceResponse
     */
    public ListCustomAudienceResponse listCustomAudience(ListCustomAudienceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomAudienceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DirectMail accounts under your Alibaba Cloud account.</p>
     * 
     * @param request ListDmAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDmAccountResponse
     */
    public ListDmAccountResponse listDmAccountWithOptions(ListDmAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendType)) {
            query.put("SendType", request.sendType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDmAccount"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDmAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DirectMail accounts under your Alibaba Cloud account.</p>
     * 
     * @param request ListDmAccountRequest
     * @return ListDmAccountResponse
     */
    public ListDmAccountResponse listDmAccount(ListDmAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDmAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询DM的tag</p>
     * 
     * @param request ListDmTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDmTagResponse
     */
    public ListDmTagResponse listDmTagWithOptions(ListDmTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDmTag"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDmTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询DM的tag</p>
     * 
     * @param request ListDmTagRequest
     * @return ListDmTagResponse
     */
    public ListDmTagResponse listDmTag(ListDmTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDmTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Facebook posts.</p>
     * 
     * @param request ListFacebookPostsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFacebookPostsResponse
     */
    public ListFacebookPostsResponse listFacebookPostsWithOptions(ListFacebookPostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFacebookPosts"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFacebookPostsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Facebook posts.</p>
     * 
     * @param request ListFacebookPostsRequest
     * @return ListFacebookPostsResponse
     */
    public ListFacebookPostsResponse listFacebookPosts(ListFacebookPostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFacebookPostsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 5 requests per second (RPS) per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of WhatsApp flows.</p>
     * 
     * @param tmpReq ListFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowResponse
     */
    public ListFlowResponse listFlowWithOptions(ListFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFlowShrinkRequest request = new ListFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            query.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 5 requests per second (RPS) per account. Excess requests are throttled and may result in service interruptions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of WhatsApp flows.</p>
     * 
     * @param request ListFlowRequest
     * @return ListFlowResponse
     */
    public ListFlowResponse listFlow(ListFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists flow component groups.</p>
     * 
     * @param request ListFlowNodeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowNodeGroupResponse
     */
    public ListFlowNodeGroupResponse listFlowNodeGroupWithOptions(ListFlowNodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowNodeGroup"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowNodeGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists flow component groups.</p>
     * 
     * @param request ListFlowNodeGroupRequest
     * @return ListFlowNodeGroupResponse
     */
    public ListFlowNodeGroupResponse listFlowNodeGroup(ListFlowNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowNodeGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this API operation to query flow component prototypes. You can also view the prototypes on the orchestration canvas in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> by clicking a flow name.</li>
     * <li>You can use the optional parameters for this operation to filter flow component prototypes. If you do not specify any optional parameters, all flow component prototypes are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists flow component prototypes.</p>
     * 
     * @param request ListFlowNodePrototypeV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowNodePrototypeV2Response
     */
    public ListFlowNodePrototypeV2Response listFlowNodePrototypeV2WithOptions(ListFlowNodePrototypeV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupCode)) {
            query.put("GroupCode", request.groupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowNodePrototypeV2"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowNodePrototypeV2Response());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this API operation to query flow component prototypes. You can also view the prototypes on the orchestration canvas in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> by clicking a flow name.</li>
     * <li>You can use the optional parameters for this operation to filter flow component prototypes. If you do not specify any optional parameters, all flow component prototypes are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists flow component prototypes.</p>
     * 
     * @param request ListFlowNodePrototypeV2Request
     * @return ListFlowNodePrototypeV2Response
     */
    public ListFlowNodePrototypeV2Response listFlowNodePrototypeV2(ListFlowNodePrototypeV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowNodePrototypeV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this API operation to query flow versions. You can also view flow versions in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> by clicking a flow name to open the orchestration canvas.</li>
     * <li>Before calling this API operation, make sure that you have created one or more flows.</li>
     * <li>If you have not created any flows, create a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> or call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> API operation.</li>
     * <li>The optional parameters for this API operation are filter conditions. If you do not specify any optional parameters, all flow versions are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists flow versions.</p>
     * 
     * @param tmpReq ListFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowVersionResponse
     */
    public ListFlowVersionResponse listFlowVersionWithOptions(ListFlowVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFlowVersionShrinkRequest request = new ListFlowVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowVersion"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this API operation to query flow versions. You can also view flow versions in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> by clicking a flow name to open the orchestration canvas.</li>
     * <li>Before calling this API operation, make sure that you have created one or more flows.</li>
     * <li>If you have not created any flows, create a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> or call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> API operation.</li>
     * <li>The optional parameters for this API operation are filter conditions. If you do not specify any optional parameters, all flow versions are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists flow versions.</p>
     * 
     * @param request ListFlowVersionRequest
     * @return ListFlowVersionResponse
     */
    public ListFlowVersionResponse listFlowVersion(ListFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the Instagram pages associated with an instance.</p>
     * 
     * @param request ListInstagramPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstagramPageResponse
     */
    public ListInstagramPageResponse listInstagramPageWithOptions(ListInstagramPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstagramPage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstagramPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the Instagram pages associated with an instance.</p>
     * 
     * @param request ListInstagramPageRequest
     * @return ListInstagramPageResponse
     */
    public ListInstagramPageResponse listInstagramPage(ListInstagramPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstagramPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询instagram帖子列表</p>
     * 
     * @param request ListInstagramPostsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstagramPostsResponse
     */
    public ListInstagramPostsResponse listInstagramPostsWithOptions(ListInstagramPostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstagramPosts"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstagramPostsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询instagram帖子列表</p>
     * 
     * @param request ListInstagramPostsRequest
     * @return ListInstagramPostsResponse
     */
    public ListInstagramPostsResponse listInstagramPosts(ListInstagramPostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstagramPostsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists instances.</p>
     * 
     * @param request ListInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterStr)) {
            query.put("FilterStr", request.filterStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitTime)) {
            query.put("SubmitTime", request.submitTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstance"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists instances.</p>
     * 
     * @param request ListInstanceRequest
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of marketing campaigns.</p>
     * 
     * @param tmpReq ListMarketingFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMarketingFlowResponse
     */
    public ListMarketingFlowResponse listMarketingFlowWithOptions(ListMarketingFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMarketingFlowShrinkRequest request = new ListMarketingFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityCode)) {
            query.put("ActivityCode", request.activityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityName)) {
            query.put("ActivityName", request.activityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityStatus)) {
            query.put("ActivityStatus", request.activityStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedFlowCode)) {
            query.put("RelatedFlowCode", request.relatedFlowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedGroupId)) {
            query.put("RelatedGroupId", request.relatedGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMarketingFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMarketingFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of marketing campaigns.</p>
     * 
     * @param request ListMarketingFlowRequest
     * @return ListMarketingFlowResponse
     */
    public ListMarketingFlowResponse listMarketingFlow(ListMarketingFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMarketingFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of budgets.</p>
     * 
     * @param tmpReq ListMessageCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMessageCampaignResponse
     */
    public ListMessageCampaignResponse listMessageCampaignWithOptions(ListMessageCampaignRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMessageCampaignShrinkRequest request = new ListMessageCampaignShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.campaignName)) {
            query.put("CampaignName", request.campaignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMessageCampaign"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessageCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of budgets.</p>
     * 
     * @param request ListMessageCampaignRequest
     * @return ListMessageCampaignResponse
     */
    public ListMessageCampaignResponse listMessageCampaign(ListMessageCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMessageCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom audiences and subscription tokens.</p>
     * 
     * @param request ListMessengerSubscriptionTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMessengerSubscriptionTokenResponse
     */
    public ListMessengerSubscriptionTokenResponse listMessengerSubscriptionTokenWithOptions(ListMessengerSubscriptionTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAudienceId)) {
            query.put("CustomAudienceId", request.customAudienceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageKey)) {
            query.put("PageKey", request.pageKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenType)) {
            query.put("TokenType", request.tokenType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMessengerSubscriptionToken"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessengerSubscriptionTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom audiences and subscription tokens.</p>
     * 
     * @param request ListMessengerSubscriptionTokenRequest
     * @return ListMessengerSubscriptionTokenResponse
     */
    public ListMessengerSubscriptionTokenResponse listMessengerSubscriptionToken(ListMessengerSubscriptionTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMessengerSubscriptionTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of ad accounts bound to a page.</p>
     * 
     * @param request ListPageAdAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPageAdAccountResponse
     */
    public ListPageAdAccountResponse listPageAdAccountWithOptions(ListPageAdAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPageAdAccount"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPageAdAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of ad accounts bound to a page.</p>
     * 
     * @param request ListPageAdAccountRequest
     * @return ListPageAdAccountResponse
     */
    public ListPageAdAccountResponse listPageAdAccount(ListPageAdAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPageAdAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 5 per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of message QR codes.</p>
     * 
     * @param request ListPhoneMessageQrdlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPhoneMessageQrdlResponse
     */
    public ListPhoneMessageQrdlResponse listPhoneMessageQrdlWithOptions(ListPhoneMessageQrdlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPhoneMessageQrdl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPhoneMessageQrdlResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 5 per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of message QR codes.</p>
     * 
     * @param request ListPhoneMessageQrdlRequest
     * @return ListPhoneMessageQrdlResponse
     */
    public ListPhoneMessageQrdlResponse listPhoneMessageQrdl(ListPhoneMessageQrdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPhoneMessageQrdlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves products in a catalog.</p>
     * 
     * @param request ListProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductResponse
     */
    public ListProductResponse listProductWithOptions(ListProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.after)) {
            query.put("After", request.after);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.before)) {
            query.put("Before", request.before);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            query.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProduct"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves products in a catalog.</p>
     * 
     * @param request ListProductRequest
     * @return ListProductResponse
     */
    public ListProductResponse listProduct(ListProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China (Hangzhou) region is used as an example. The China (Hangzhou) region is used as an example. The China (Hangzhou) region is used as an example. The per-user QPS limit for this API is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the catalog list of the Meta Business platform.</p>
     * 
     * @param request ListProductCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductCatalogResponse
     */
    public ListProductCatalogResponse listProductCatalogWithOptions(ListProductCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.after)) {
            query.put("After", request.after);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.before)) {
            query.put("Before", request.before);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            query.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            query.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductCatalog"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductCatalogResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China (Hangzhou) region is used as an example. The China (Hangzhou) region is used as an example. The China (Hangzhou) region is used as an example. The per-user QPS limit for this API is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the catalog list of the Meta Business platform.</p>
     * 
     * @param request ListProductCatalogRequest
     * @return ListProductCatalogResponse
     */
    public ListProductCatalogResponse listProductCatalog(ListProductCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductCatalogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>展示viber申请单服务号卡片</p>
     * 
     * @param request ListViberServiceMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListViberServiceMessageResponse
     */
    public ListViberServiceMessageResponse listViberServiceMessageWithOptions(ListViberServiceMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListViberServiceMessage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListViberServiceMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>展示viber申请单服务号卡片</p>
     * 
     * @param request ListViberServiceMessageRequest
     * @return ListViberServiceMessageResponse
     */
    public ListViberServiceMessageResponse listViberServiceMessage(ListViberServiceMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listViberServiceMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists message templates.</p>
     * 
     * @param request ListWhatAppTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWhatAppTemplateResponse
     */
    public ListWhatAppTemplateResponse listWhatAppTemplateWithOptions(ListWhatAppTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hetuParams)) {
            query.put("HetuParams", request.hetuParams);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWhatAppTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWhatAppTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists message templates.</p>
     * 
     * @param request ListWhatAppTemplateRequest
     * @return ListWhatAppTemplateResponse
     */
    public ListWhatAppTemplateResponse listWhatAppTemplate(ListWhatAppTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWhatAppTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * <h3>Status changes</h3>
     * <p>Changes to the template status and quality can be monitored through MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a message template. Only templates that have not been reviewed or that failed the review can be modified.</p>
     * 
     * @param tmpReq ModifyChatappTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyChatappTemplateResponse
     */
    public ModifyChatappTemplateResponse modifyChatappTemplateWithOptions(ModifyChatappTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyChatappTemplateShrinkRequest request = new ModifyChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.example)) {
            request.exampleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.example, "Example", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryChangePaused)) {
            body.put("CategoryChangePaused", request.categoryChangePaused);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            body.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            body.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exampleShrink)) {
            body.put("Example", request.exampleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            body.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageSendTtlSeconds)) {
            body.put("MessageSendTtlSeconds", request.messageSendTtlSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyChatappTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * <h3>Status changes</h3>
     * <p>Changes to the template status and quality can be monitored through MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a message template. Only templates that have not been reviewed or that failed the review can be modified.</p>
     * 
     * @param request ModifyChatappTemplateRequest
     * @return ModifyChatappTemplateResponse
     */
    public ModifyChatappTemplateResponse modifyChatappTemplate(ModifyChatappTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyChatappTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies some properties of a template.</p>
     * 
     * @param request ModifyChatappTemplatePropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyChatappTemplatePropertiesResponse
     */
    public ModifyChatappTemplatePropertiesResponse modifyChatappTemplatePropertiesWithOptions(ModifyChatappTemplatePropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowSend)) {
            query.put("AllowSend", request.allowSend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryChangePaused)) {
            query.put("CategoryChangePaused", request.categoryChangePaused);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyChatappTemplateProperties"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyChatappTemplatePropertiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies some properties of a template.</p>
     * 
     * @param request ModifyChatappTemplatePropertiesRequest
     * @return ModifyChatappTemplatePropertiesResponse
     */
    public ModifyChatappTemplatePropertiesResponse modifyChatappTemplateProperties(ModifyChatappTemplatePropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyChatappTemplatePropertiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Short Message Service (China SMS) API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the basic information of a flow.</p>
     * 
     * @param tmpReq ModifyFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFlowResponse
     */
    public ModifyFlowResponse modifyFlowWithOptions(ModifyFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyFlowShrinkRequest request = new ModifyFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categories)) {
            request.categoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categories, "Categories", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoriesShrink)) {
            query.put("Categories", request.categoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointUri)) {
            query.put("EndpointUri", request.endpointUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            query.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Short Message Service (China SMS) API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the basic information of a flow.</p>
     * 
     * @param request ModifyFlowRequest
     * @return ModifyFlowResponse
     */
    public ModifyFlowResponse modifyFlow(ModifyFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service (China) API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Manage your calls appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the commercial information of a phone number.</p>
     * 
     * @param tmpReq ModifyPhoneBusinessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPhoneBusinessProfileResponse
     */
    public ModifyPhoneBusinessProfileResponse modifyPhoneBusinessProfileWithOptions(ModifyPhoneBusinessProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPhoneBusinessProfileShrinkRequest request = new ModifyPhoneBusinessProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.websites)) {
            request.websitesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.websites, "Websites", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.about)) {
            query.put("About", request.about);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profilePictureUrl)) {
            query.put("ProfilePictureUrl", request.profilePictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vertical)) {
            query.put("Vertical", request.vertical);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websitesShrink)) {
            query.put("Websites", request.websitesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPhoneBusinessProfile"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPhoneBusinessProfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service (China) API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Manage your calls appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the commercial information of a phone number.</p>
     * 
     * @param request ModifyPhoneBusinessProfileRequest
     * @return ModifyPhoneBusinessProfileResponse
     */
    public ModifyPhoneBusinessProfileResponse modifyPhoneBusinessProfile(ModifyPhoneBusinessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPhoneBusinessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>联系人变更群组</p>
     * 
     * @param tmpReq MoveContactToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveContactToGroupResponse
     */
    public MoveContactToGroupResponse moveContactToGroupWithOptions(MoveContactToGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MoveContactToGroupShrinkRequest request = new MoveContactToGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacts)) {
            query.put("Contacts", request.contacts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkExistGroups)) {
            query.put("LinkExistGroups", request.linkExistGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkNewGroups)) {
            query.put("LinkNewGroups", request.linkNewGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveContactToGroup"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveContactToGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>联系人变更群组</p>
     * 
     * @param request MoveContactToGroupRequest
     * @return MoveContactToGroupResponse
     */
    public MoveContactToGroupResponse moveContactToGroup(MoveContactToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveContactToGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to unpublish a flow version. You can also manually unpublish a flow version in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> by clicking the flow name to open the orchestration canvas.</li>
     * <li>Before calling this operation, make sure that the flow is published.</li>
     * <li>If a flow is not published, you can publish it manually from the orchestration canvas in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>, or by calling the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> operation.</li>
     * <li>After a flow version is unpublished, the orchestrated flow stops running. This may affect your business. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unpublishes a flow version.</p>
     * 
     * @param tmpReq OfflineFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineFlowVersionResponse
     */
    public OfflineFlowVersionResponse offlineFlowVersionWithOptions(OfflineFlowVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OfflineFlowVersionShrinkRequest request = new OfflineFlowVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineFlowVersion"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to unpublish a flow version. You can also manually unpublish a flow version in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> by clicking the flow name to open the orchestration canvas.</li>
     * <li>Before calling this operation, make sure that the flow is published.</li>
     * <li>If a flow is not published, you can publish it manually from the orchestration canvas in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>, or by calling the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> operation.</li>
     * <li>After a flow version is unpublished, the orchestrated flow stops running. This may affect your business. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unpublishes a flow version.</p>
     * 
     * @param request OfflineFlowVersionRequest
     * @return OfflineFlowVersionResponse
     */
    public OfflineFlowVersionResponse offlineFlowVersion(OfflineFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to publish a flow version. You can also manually publish a flow version in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> by clicking the flow name to open the orchestration canvas.</li>
     * <li>Before you call this operation, make sure that you have created a flow and attached it to a phone number or a business account ID.</li>
     * <li>If you have not created a flow, you can create one manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> and attach a phone number or business account ID. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> and <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operations to create a flow and attach a phone number or business account ID.</li>
     * <li>After a flow with a non-manual trigger is published, it is triggered when the attached phone number or business account sends a message to the business. If your flow contains components that incur fees, such as message sending or function invocations, make sure you understand the billing methods and pricing of the related products before you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Publishes a flow version.</p>
     * 
     * @param tmpReq OnlineFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineFlowVersionResponse
     */
    public OnlineFlowVersionResponse onlineFlowVersionWithOptions(OnlineFlowVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OnlineFlowVersionShrinkRequest request = new OnlineFlowVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineFlowVersion"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to publish a flow version. You can also manually publish a flow version in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> by clicking the flow name to open the orchestration canvas.</li>
     * <li>Before you call this operation, make sure that you have created a flow and attached it to a phone number or a business account ID.</li>
     * <li>If you have not created a flow, you can create one manually in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> and attach a phone number or business account ID. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> and <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operations to create a flow and attach a phone number or business account ID.</li>
     * <li>After a flow with a non-manual trigger is published, it is triggered when the attached phone number or business account sends a message to the business. If your flow contains components that incur fees, such as message sending or function invocations, make sure you understand the billing methods and pricing of the related products before you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Publishes a flow version.</p>
     * 
     * @param request OnlineFlowVersionRequest
     * @return OnlineFlowVersionResponse
     */
    public OnlineFlowVersionResponse onlineFlowVersion(OnlineFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onlineFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开通Chatapp服务</p>
     * 
     * @param request OpenChatappServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenChatappServiceResponse
     */
    public OpenChatappServiceResponse openChatappServiceWithOptions(OpenChatappServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenChatappService"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenChatappServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开通Chatapp服务</p>
     * 
     * @param request OpenChatappServiceRequest
     * @return OpenChatappServiceResponse
     */
    public OpenChatappServiceResponse openChatappService(OpenChatappServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openChatappServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂停服务</p>
     * 
     * @param request PauseMarketingFLowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseMarketingFLowResponse
     */
    public PauseMarketingFLowResponse pauseMarketingFLowWithOptions(PauseMarketingFLowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityCode)) {
            query.put("ActivityCode", request.activityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseMarketingFLow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseMarketingFLowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂停服务</p>
     * 
     * @param request PauseMarketingFLowRequest
     * @return PauseMarketingFLowResponse
     */
    public PauseMarketingFLowResponse pauseMarketingFLow(PauseMarketingFLowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseMarketingFLowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have a successfully created WhatsApp Flow.</li>
     * <li>If you do not have a successfully created WhatsApp Flow, create one by calling the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> operation.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a Flow.</p>
     * 
     * @param request PublishFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishFlowResponse
     */
    public PublishFlowResponse publishFlowWithOptions(PublishFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have a successfully created WhatsApp Flow.</li>
     * <li>If you do not have a successfully created WhatsApp Flow, create one by calling the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> operation.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Publishes a Flow.</p>
     * 
     * @param request PublishFlowRequest
     * @return PublishFlowResponse
     */
    public PublishFlowResponse publishFlow(PublishFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API has a per-user QPS limit of 10. Calls that exceed this limit are subject to flow control, which may impact your business. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the WhatsApp Business Account (WABA) that is bound to a customer account.</p>
     * 
     * @param request QueryChatappBindWabaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryChatappBindWabaResponse
     */
    public QueryChatappBindWabaResponse queryChatappBindWabaWithOptions(QueryChatappBindWabaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChatappBindWaba"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChatappBindWabaResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API has a per-user QPS limit of 10. Calls that exceed this limit are subject to flow control, which may impact your business. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the WhatsApp Business Account (WABA) that is bound to a customer account.</p>
     * 
     * @param request QueryChatappBindWabaRequest
     * @return QueryChatappBindWabaResponse
     */
    public QueryChatappBindWabaResponse queryChatappBindWaba(QueryChatappBindWabaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryChatappBindWabaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all phone numbers used for sending messages and their statuses for a customer.</p>
     * 
     * @param request QueryChatappPhoneNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryChatappPhoneNumbersResponse
     */
    public QueryChatappPhoneNumbersResponse queryChatappPhoneNumbersWithOptions(QueryChatappPhoneNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChatappPhoneNumbers"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChatappPhoneNumbersResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all phone numbers used for sending messages and their statuses for a customer.</p>
     * 
     * @param request QueryChatappPhoneNumbersRequest
     * @return QueryChatappPhoneNumbersResponse
     */
    public QueryChatappPhoneNumbersResponse queryChatappPhoneNumbers(QueryChatappPhoneNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryChatappPhoneNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the details of a specified instance.</p>
     * 
     * @param request QueryInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInstanceResponse
     */
    public QueryInstanceResponse queryInstanceWithOptions(QueryInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstance"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the details of a specified instance.</p>
     * 
     * @param request QueryInstanceRequest
     * @return QueryInstanceResponse
     */
    public QueryInstanceResponse queryInstance(QueryInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询营销消息是否生效</p>
     * 
     * @param request QueryMMLActiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMMLActiveResponse
     */
    public QueryMMLActiveResponse queryMMLActiveWithOptions(QueryMMLActiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMMLActive"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMMLActiveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询营销消息是否生效</p>
     * 
     * @param request QueryMMLActiveRequest
     * @return QueryMMLActiveResponse
     */
    public QueryMMLActiveResponse queryMMLActive(QueryMMLActiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMMLActiveWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the business information of a phone number.</p>
     * 
     * @param request QueryPhoneBusinessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPhoneBusinessProfileResponse
     */
    public QueryPhoneBusinessProfileResponse queryPhoneBusinessProfileWithOptions(QueryPhoneBusinessProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPhoneBusinessProfile"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPhoneBusinessProfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the business information of a phone number.</p>
     * 
     * @param request QueryPhoneBusinessProfileRequest
     * @return QueryPhoneBusinessProfileResponse
     */
    public QueryPhoneBusinessProfileResponse queryPhoneBusinessProfile(QueryPhoneBusinessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPhoneBusinessProfileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the business information about the WhatsApp Business account (WABA).</p>
     * 
     * @param request QueryWabaBusinessInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWabaBusinessInfoResponse
     */
    public QueryWabaBusinessInfoResponse queryWabaBusinessInfoWithOptions(QueryWabaBusinessInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWabaBusinessInfo"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWabaBusinessInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the business information about the WhatsApp Business account (WABA).</p>
     * 
     * @param request QueryWabaBusinessInfoRequest
     * @return QueryWabaBusinessInfoResponse
     */
    public QueryWabaBusinessInfoResponse queryWabaBusinessInfo(QueryWabaBusinessInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWabaBusinessInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this API operation to retrieve the details of a flow. You can also view the flow details in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>.</li>
     * <li>Before you call this operation, make sure that you have created a flow.</li>
     * <li>If you have not created a flow, you can create one in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> or by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a flow.</p>
     * 
     * @param tmpReq ReadChatFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadChatFlowResponse
     */
    public ReadChatFlowResponse readChatFlowWithOptions(ReadChatFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReadChatFlowShrinkRequest request = new ReadChatFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadChatFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadChatFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this API operation to retrieve the details of a flow. You can also view the flow details in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>.</li>
     * <li>Before you call this operation, make sure that you have created a flow.</li>
     * <li>If you have not created a flow, you can create one in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> or by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a flow.</p>
     * 
     * @param request ReadChatFlowRequest
     * @return ReadChatFlowResponse
     */
    public ReadChatFlowResponse readChatFlow(ReadChatFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readChatFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that log settings are configured for the flow.</li>
     * <li>If log settings are not configured for the flow, call the <a href="https://help.aliyun.com/document_detail/2937211.html">CreateChatFlowLogSetting</a> operation to configure them.</li>
     * <li>You can use the unique ID returned by this operation to call the <a href="https://help.aliyun.com/document_detail/2937210.html">UpdateChatFlowLogSetting</a> operation to update the log settings.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Views the log settings for a flow.</p>
     * 
     * @param request ReadChatFlowLogSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadChatFlowLogSettingResponse
     */
    public ReadChatFlowLogSettingResponse readChatFlowLogSettingWithOptions(ReadChatFlowLogSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadChatFlowLogSetting"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadChatFlowLogSettingResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that log settings are configured for the flow.</li>
     * <li>If log settings are not configured for the flow, call the <a href="https://help.aliyun.com/document_detail/2937211.html">CreateChatFlowLogSetting</a> operation to configure them.</li>
     * <li>You can use the unique ID returned by this operation to call the <a href="https://help.aliyun.com/document_detail/2937210.html">UpdateChatFlowLogSetting</a> operation to update the log settings.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Views the log settings for a flow.</p>
     * 
     * @param request ReadChatFlowLogSettingRequest
     * @return ReadChatFlowLogSettingResponse
     */
    public ReadChatFlowLogSettingResponse readChatFlowLogSetting(ReadChatFlowLogSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readChatFlowLogSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query a flow version. You can also click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to go to the canvas orchestration page and view the flow version.</li>
     * <li>Before calling this operation, make sure that you have successfully created a flow.</li>
     * <li>If you do not have a successfully created flow, you can manually create a flow on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page or create a flow by calling <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a flow version.</p>
     * 
     * @param tmpReq ReadFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadFlowVersionResponse
     */
    public ReadFlowVersionResponse readFlowVersionWithOptions(ReadFlowVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReadFlowVersionShrinkRequest request = new ReadFlowVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadFlowVersion"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query a flow version. You can also click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to go to the canvas orchestration page and view the flow version.</li>
     * <li>Before calling this operation, make sure that you have successfully created a flow.</li>
     * <li>If you do not have a successfully created flow, you can manually create a flow on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page or create a flow by calling <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a flow version.</p>
     * 
     * @param request ReadFlowVersionRequest
     * @return ReadFlowVersionResponse
     */
    public ReadFlowVersionResponse readFlowVersion(ReadFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>当前群组移除单个联系人</p>
     * 
     * @param request RemoveContactByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveContactByIdResponse
     */
    public RemoveContactByIdResponse removeContactByIdWithOptions(RemoveContactByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveContactById"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveContactByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>当前群组移除单个联系人</p>
     * 
     * @param request RemoveContactByIdRequest
     * @return RemoveContactByIdResponse
     */
    public RemoveContactByIdResponse removeContactById(RemoveContactByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeContactByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China-specific QPS limit for a single user of this API operation is 100 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a request to the WhatsApp Conversions API.</p>
     * 
     * @param tmpReq RequestWhatsappConversionApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequestWhatsappConversionApiResponse
     */
    public RequestWhatsappConversionApiResponse requestWhatsappConversionApiWithOptions(RequestWhatsappConversionApiRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RequestWhatsappConversionApiShrinkRequest request = new RequestWhatsappConversionApiShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.requestData)) {
            request.requestDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.requestData, "RequestData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestDataShrink)) {
            query.put("RequestData", request.requestDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequestWhatsappConversionApi"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestWhatsappConversionApiResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China-specific QPS limit for a single user of this API operation is 100 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a request to the WhatsApp Conversions API.</p>
     * 
     * @param request RequestWhatsappConversionApiRequest
     * @return RequestWhatsappConversionApiResponse
     */
    public RequestWhatsappConversionApiResponse requestWhatsappConversionApi(RequestWhatsappConversionApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestWhatsappConversionApiWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to send messages in batches. You can also manually send messages in batches on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Message Sending</strong> page.</li>
     * <li>Before calling this operation, make sure that you have created a channel and have an approved template.</li>
     * <li>For WhatsApp channels, complete <a href="https://help.aliyun.com/document_detail/172335.html">WABA registration and bindng</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">add a phone number</a>.</li>
     * <li>For Messenger channels, complete <a href="https://help.aliyun.com/document_detail/2837713.html">connecting a public page account</a>.</li>
     * <li>For Instagram channels, complete <a href="https://help.aliyun.com/document_detail/2837720.html">connecting a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;- For Viber channels, complete <a href="https://help.aliyun.com/document_detail/2807995.html">applying for a service ID</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as appropriate.</li>
     * <li>A maximum of 1,000 phone numbers are supported per request.</li>
     * </ul>
     * <h3>Status changes</h3>
     * <p>You can monitor message sending status through MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends Chat App messages in batches.</p>
     * 
     * @param tmpReq SendChatappMassMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendChatappMassMessageResponse
     */
    public SendChatappMassMessageResponse sendChatappMassMessageWithOptions(SendChatappMassMessageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendChatappMassMessageShrinkRequest request = new SendChatappMassMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.senderList)) {
            request.senderListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.senderList, "SenderList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackContent)) {
            query.put("FallBackContent", request.fallBackContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackDuration)) {
            query.put("FallBackDuration", request.fallBackDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackId)) {
            query.put("FallBackId", request.fallBackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackRule)) {
            query.put("FallBackRule", request.fallBackRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderListShrink)) {
            query.put("SenderList", request.senderListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendChatappMassMessage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendChatappMassMessageResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to send messages in batches. You can also manually send messages in batches on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Message Sending</strong> page.</li>
     * <li>Before calling this operation, make sure that you have created a channel and have an approved template.</li>
     * <li>For WhatsApp channels, complete <a href="https://help.aliyun.com/document_detail/172335.html">WABA registration and bindng</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">add a phone number</a>.</li>
     * <li>For Messenger channels, complete <a href="https://help.aliyun.com/document_detail/2837713.html">connecting a public page account</a>.</li>
     * <li>For Instagram channels, complete <a href="https://help.aliyun.com/document_detail/2837720.html">connecting a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;- For Viber channels, complete <a href="https://help.aliyun.com/document_detail/2807995.html">applying for a service ID</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as appropriate.</li>
     * <li>A maximum of 1,000 phone numbers are supported per request.</li>
     * </ul>
     * <h3>Status changes</h3>
     * <p>You can monitor message sending status through MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends Chat App messages in batches.</p>
     * 
     * @param request SendChatappMassMessageRequest
     * @return SendChatappMassMessageResponse
     */
    public SendChatappMassMessageResponse sendChatappMassMessage(SendChatappMassMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendChatappMassMessageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to send a message, or manually send a message on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Send Message</strong> page.</li>
     * <li>Before calling this operation, make sure that you have created a channel and have an approved template.</li>
     * <li>For the WhatsApp channel type, you must complete <a href="https://help.aliyun.com/document_detail/172335.html">WABA registration and bindng</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">add a phone number</a>.</li>
     * <li>For the Messenger channel type, you must complete <a href="https://help.aliyun.com/document_detail/2837713.html">connecting a public page account</a>.</li>
     * <li>For the Instagram channel type, you must complete <a href="https://help.aliyun.com/document_detail/2837720.html">connecting a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;- For the Viber channel type, you must complete <a href="https://help.aliyun.com/document_detail/2807995.html">applying for a service ID</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 250 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * <h3>Status changes</h3>
     * <p>You can monitor message delivery status through MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a Chat App Message Service message.</p>
     * 
     * @param tmpReq SendChatappMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendChatappMessageResponse
     */
    public SendChatappMessageResponse sendChatappMessageWithOptions(SendChatappMessageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendChatappMessageShrinkRequest request = new SendChatappMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.flowAction)) {
            request.flowActionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.flowAction, "FlowAction", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productAction)) {
            request.productActionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productAction, "ProductAction", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateParams)) {
            request.templateParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateParams, "TemplateParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextMessageId)) {
            query.put("ContextMessageId", request.contextMessageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackContent)) {
            query.put("FallBackContent", request.fallBackContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackDuration)) {
            query.put("FallBackDuration", request.fallBackDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackId)) {
            query.put("FallBackId", request.fallBackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallBackRule)) {
            query.put("FallBackRule", request.fallBackRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowActionShrink)) {
            query.put("FlowAction", request.flowActionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvCode)) {
            query.put("IsvCode", request.isvCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageCampaignId)) {
            query.put("MessageCampaignId", request.messageCampaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productActionShrink)) {
            query.put("ProductAction", request.productActionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recipientType)) {
            query.put("RecipientType", request.recipientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParamsShrink)) {
            query.put("TemplateParams", request.templateParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenType)) {
            query.put("TokenType", request.tokenType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trackingData)) {
            query.put("TrackingData", request.trackingData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendChatappMessage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendChatappMessageResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to send a message, or manually send a message on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Send Message</strong> page.</li>
     * <li>Before calling this operation, make sure that you have created a channel and have an approved template.</li>
     * <li>For the WhatsApp channel type, you must complete <a href="https://help.aliyun.com/document_detail/172335.html">WABA registration and bindng</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">add a phone number</a>.</li>
     * <li>For the Messenger channel type, you must complete <a href="https://help.aliyun.com/document_detail/2837713.html">connecting a public page account</a>.</li>
     * <li>For the Instagram channel type, you must complete <a href="https://help.aliyun.com/document_detail/2837720.html">connecting a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;- For the Viber channel type, you must complete <a href="https://help.aliyun.com/document_detail/2807995.html">applying for a service ID</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 250 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * <h3>Status changes</h3>
     * <p>You can monitor message delivery status through MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a Chat App Message Service message.</p>
     * 
     * @param request SendChatappMessageRequest
     * @return SendChatappMessageResponse
     */
    public SendChatappMessageResponse sendChatappMessage(SendChatappMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendChatappMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits the result of a verification code check.</p>
     * 
     * @param request SubmitVerifyCodeResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVerifyCodeResultResponse
     */
    public SubmitVerifyCodeResultResponse submitVerifyCodeResultWithOptions(SubmitVerifyCodeResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.result)) {
            query.put("Result", request.result);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVerifyCodeResult"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVerifyCodeResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits the result of a verification code check.</p>
     * 
     * @param request SubmitVerifyCodeResultRequest
     * @return SubmitVerifyCodeResultResponse
     */
    public SubmitVerifyCodeResultResponse submitVerifyCodeResult(SubmitVerifyCodeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVerifyCodeResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, configure the webhooks for messages and receipts by using <a href="https://help.aliyun.com/document_detail/600763.html">UpdatePhoneWebhook</a> and <a href="https://help.aliyun.com/document_detail/600765.html">UpdateAccountWebhook</a>. Otherwise, the webhook address cannot be found during historical message synchronization, which causes the synchronization to fail.</li>
     * <li>This operation takes effect only once. After the first call, subsequent calls do not trigger historical message pushes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes business app historical records.</p>
     * 
     * @param request SyncBusinessAppHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncBusinessAppHistoryResponse
     */
    public SyncBusinessAppHistoryResponse syncBusinessAppHistoryWithOptions(SyncBusinessAppHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncBusinessAppHistory"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncBusinessAppHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, configure the webhooks for messages and receipts by using <a href="https://help.aliyun.com/document_detail/600763.html">UpdatePhoneWebhook</a> and <a href="https://help.aliyun.com/document_detail/600765.html">UpdateAccountWebhook</a>. Otherwise, the webhook address cannot be found during historical message synchronization, which causes the synchronization to fail.</li>
     * <li>This operation takes effect only once. After the first call, subsequent calls do not trigger historical message pushes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes business app historical records.</p>
     * 
     * @param request SyncBusinessAppHistoryRequest
     * @return SyncBusinessAppHistoryResponse
     */
    public SyncBusinessAppHistoryResponse syncBusinessAppHistory(SyncBusinessAppHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncBusinessAppHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步flow</p>
     * 
     * @param request SyncFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncFlowResponse
     */
    public SyncFlowResponse syncFlowWithOptions(SyncFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步flow</p>
     * 
     * @param request SyncFlowRequest
     * @return SyncFlowResponse
     */
    public SyncFlowResponse syncFlow(SyncFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronously queries the budget.</p>
     * 
     * @param request SyncMessageCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncMessageCampaignResponse
     */
    public SyncMessageCampaignResponse syncMessageCampaignWithOptions(SyncMessageCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adAccountId)) {
            query.put("AdAccountId", request.adAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncMessageCampaign"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncMessageCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronously queries the budget.</p>
     * 
     * @param request SyncMessageCampaignRequest
     * @return SyncMessageCampaignResponse
     */
    public SyncMessageCampaignResponse syncMessageCampaign(SyncMessageCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncMessageCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Messenger subscription token.</p>
     * 
     * @param request SyncMessengerSubscriptionTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncMessengerSubscriptionTokenResponse
     */
    public SyncMessengerSubscriptionTokenResponse syncMessengerSubscriptionTokenWithOptions(SyncMessengerSubscriptionTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAudienceId)) {
            query.put("CustomAudienceId", request.customAudienceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenType)) {
            query.put("TokenType", request.tokenType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncMessengerSubscriptionToken"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncMessengerSubscriptionTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Messenger subscription token.</p>
     * 
     * @param request SyncMessengerSubscriptionTokenRequest
     * @return SyncMessengerSubscriptionTokenResponse
     */
    public SyncMessengerSubscriptionTokenResponse syncMessengerSubscriptionToken(SyncMessengerSubscriptionTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncMessengerSubscriptionTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to trigger a published version of a flow that has a manual trigger. You can also trigger the flow from the <a href="https://chatapp.console.aliyun.com/MarketingActivityManagement">Marketing Campaign Management</a> page if the flow is associated with a marketing campaign.</li>
     * <li>Before you call this operation, make sure that the flow has a manual trigger and is published.</li>
     * <li>If a flow with a manual trigger does not have a published version, you must publish it. In <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Chat Flow</a>, you can click the flow name to open the canvas and publish the version. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> API to publish the version.</li>
     * <li>If your flow contains components that incur costs, such as message sending or function invocations, make sure that you understand the billing methods and pricing for these products before you trigger the flow.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Triggers an online chat flow that has a manual trigger.</p>
     * 
     * @param tmpReq TriggerChatFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerChatFlowResponse
     */
    public TriggerChatFlowResponse triggerChatFlowWithOptions(TriggerChatFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TriggerChatFlowShrinkRequest request = new TriggerChatFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.claimTimeMillis)) {
            query.put("ClaimTimeMillis", request.claimTimeMillis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            query.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardTimeMillis)) {
            query.put("DiscardTimeMillis", request.discardTimeMillis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerChatFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerChatFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to trigger a published version of a flow that has a manual trigger. You can also trigger the flow from the <a href="https://chatapp.console.aliyun.com/MarketingActivityManagement">Marketing Campaign Management</a> page if the flow is associated with a marketing campaign.</li>
     * <li>Before you call this operation, make sure that the flow has a manual trigger and is published.</li>
     * <li>If a flow with a manual trigger does not have a published version, you must publish it. In <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Chat Flow</a>, you can click the flow name to open the canvas and publish the version. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> API to publish the version.</li>
     * <li>If your flow contains components that incur costs, such as message sending or function invocations, make sure that you understand the billing methods and pricing for these products before you trigger the flow.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Triggers an online chat flow that has a manual trigger.</p>
     * 
     * @param request TriggerChatFlowRequest
     * @return TriggerChatFlowResponse
     */
    public TriggerChatFlowResponse triggerChatFlow(TriggerChatFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerChatFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑邮件账号</p>
     * 
     * @param request UnbindDmAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindDmAccountResponse
     */
    public UnbindDmAccountResponse unbindDmAccountWithOptions(UnbindDmAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindDmAccount"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDmAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑邮件账号</p>
     * 
     * @param request UnbindDmAccountRequest
     * @return UnbindDmAccountResponse
     */
    public UnbindDmAccountResponse unbindDmAccount(UnbindDmAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindDmAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the callback URL of an account.</p>
     * 
     * @param request UpdateAccountWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccountWebhookResponse
     */
    public UpdateAccountWebhookResponse updateAccountWebhookWithOptions(UpdateAccountWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpFlag)) {
            query.put("HttpFlag", request.httpFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueFlag)) {
            query.put("QueueFlag", request.queueFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCallbackUrl)) {
            query.put("StatusCallbackUrl", request.statusCallbackUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccountWebhook"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccountWebhookResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the callback URL of an account.</p>
     * 
     * @param request UpdateAccountWebhookRequest
     * @return UpdateAccountWebhookResponse
     */
    public UpdateAccountWebhookResponse updateAccountWebhook(UpdateAccountWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccountWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Viber application.</p>
     * 
     * @param tmpReq UpdateAuditRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuditRequestResponse
     */
    public UpdateAuditRequestResponse updateAuditRequestWithOptions(UpdateAuditRequestRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAuditRequestShrinkRequest request = new UpdateAuditRequestShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.auditRecord)) {
            request.auditRecordShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.auditRecord, "AuditRecord", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditRecordShrink)) {
            query.put("AuditRecord", request.auditRecordShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditResult)) {
            query.put("AuditResult", request.auditResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestNo)) {
            query.put("RequestNo", request.requestNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuditRequest"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuditRequestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Viber application.</p>
     * 
     * @param request UpdateAuditRequestRequest
     * @return UpdateAuditRequestResponse
     */
    public UpdateAuditRequestResponse updateAuditRequest(UpdateAuditRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuditRequestWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update the basic information of a flow, or update it manually on the <strong>Basic Information</strong> page under <strong>Settings</strong> in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>Before calling this operation, make sure that you have created a flow.</li>
     * <li>If you have not created a flow, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> and click <strong>Create Flow</strong> to create one.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information of a flow based on the flow code.</p>
     * 
     * @param tmpReq UpdateChatFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChatFlowResponse
     */
    public UpdateChatFlowResponse updateChatFlowWithOptions(UpdateChatFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateChatFlowShrinkRequest request = new UpdateChatFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChatFlow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChatFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update the basic information of a flow, or update it manually on the <strong>Basic Information</strong> page under <strong>Settings</strong> in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>Before calling this operation, make sure that you have created a flow.</li>
     * <li>If you have not created a flow, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> and click <strong>Create Flow</strong> to create one.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information of a flow based on the flow code.</p>
     * 
     * @param request UpdateChatFlowRequest
     * @return UpdateChatFlowResponse
     */
    public UpdateChatFlowResponse updateChatFlow(UpdateChatFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateChatFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update flow log settings, or manually update them in <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong> &gt; <strong>Log</strong>.</li>
     * <li>Before calling this operation, make sure that you have activated <a href="https://sls.console.aliyun.com/lognext/open">Simple Log Service</a> and created flow log settings.</li>
     * <li>If you have not created flow log settings for the flow, first create them by calling the <a href="https://help.aliyun.com/document_detail/2937211.html">CreateChatFlowLogSetting</a> operation.</li>
     * <li>Updating flow log settings may affect your business. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the flow log settings.</p>
     * 
     * @param request UpdateChatFlowLogSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChatFlowLogSettingResponse
     */
    public UpdateChatFlowLogSettingResponse updateChatFlowLogSettingWithOptions(UpdateChatFlowLogSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChatFlowLogSetting"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChatFlowLogSettingResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update flow log settings, or manually update them in <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong> &gt; <strong>Log</strong>.</li>
     * <li>Before calling this operation, make sure that you have activated <a href="https://sls.console.aliyun.com/lognext/open">Simple Log Service</a> and created flow log settings.</li>
     * <li>If you have not created flow log settings for the flow, first create them by calling the <a href="https://help.aliyun.com/document_detail/2937211.html">CreateChatFlowLogSetting</a> operation.</li>
     * <li>Updating flow log settings may affect your business. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the flow log settings.</p>
     * 
     * @param request UpdateChatFlowLogSettingRequest
     * @return UpdateChatFlowLogSettingResponse
     */
    public UpdateChatFlowLogSettingResponse updateChatFlowLogSetting(UpdateChatFlowLogSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateChatFlowLogSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Modifying IM group information through API is a Meta beta feature. Contact your account manager to request allowlisting.</p>
     * </blockquote>
     * <ul>
     * <li>Creating WhatsApp groups through API is a Meta beta feature. Contact your account manager to request allowlisting.</li>
     * <li>Before calling this operation, make sure that you have an IM group that has been created.</li>
     * <li>If you do not have a created IM group, create one by calling the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of an IM group.</p>
     * 
     * @param request UpdateChatGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChatGroupResponse
     */
    public UpdateChatGroupResponse updateChatGroupWithOptions(UpdateChatGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profilePictureFile)) {
            query.put("ProfilePictureFile", request.profilePictureFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChatGroup"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChatGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Modifying IM group information through API is a Meta beta feature. Contact your account manager to request allowlisting.</p>
     * </blockquote>
     * <ul>
     * <li>Creating WhatsApp groups through API is a Meta beta feature. Contact your account manager to request allowlisting.</li>
     * <li>Before calling this operation, make sure that you have an IM group that has been created.</li>
     * <li>If you do not have a created IM group, create one by calling the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of an IM group.</p>
     * 
     * @param request UpdateChatGroupRequest
     * @return UpdateChatGroupResponse
     */
    public UpdateChatGroupResponse updateChatGroup(UpdateChatGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateChatGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the commerce settings for a phone number.</p>
     * 
     * @param request UpdateCommerceSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCommerceSettingResponse
     */
    public UpdateCommerceSettingResponse updateCommerceSettingWithOptions(UpdateCommerceSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cartEnable)) {
            query.put("CartEnable", request.cartEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogVisible)) {
            query.put("CatalogVisible", request.catalogVisible);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCommerceSetting"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCommerceSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the commerce settings for a phone number.</p>
     * 
     * @param request UpdateCommerceSettingRequest
     * @return UpdateCommerceSettingResponse
     */
    public UpdateCommerceSettingResponse updateCommerceSetting(UpdateCommerceSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCommerceSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改联系人</p>
     * 
     * @param tmpReq UpdateContactByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContactByIdResponse
     */
    public UpdateContactByIdResponse updateContactByIdWithOptions(UpdateContactByIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateContactByIdShrinkRequest request = new UpdateContactByIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDetails)) {
            query.put("ContactDetails", request.contactDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContactById"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContactByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改联系人</p>
     * 
     * @param request UpdateContactByIdRequest
     * @return UpdateContactByIdResponse
     */
    public UpdateContactByIdResponse updateContactById(UpdateContactByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContactByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately.
     * This API directly retrieves data from Facebook. Facebook imposes a limit on the total number of API calls. Use this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the welcome message, conversation starters, and commands for a phone number.</p>
     * 
     * @param tmpReq UpdateConversationalAutomationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConversationalAutomationResponse
     */
    public UpdateConversationalAutomationResponse updateConversationalAutomationWithOptions(UpdateConversationalAutomationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConversationalAutomationShrinkRequest request = new UpdateConversationalAutomationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commands)) {
            request.commandsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commands, "Commands", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.prompts)) {
            request.promptsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.prompts, "Prompts", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandsShrink)) {
            query.put("Commands", request.commandsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWelcomeMessage)) {
            query.put("EnableWelcomeMessage", request.enableWelcomeMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptsShrink)) {
            query.put("Prompts", request.promptsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConversationalAutomation"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConversationalAutomationResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately.
     * This API directly retrieves data from Facebook. Facebook imposes a limit on the total number of API calls. Use this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the welcome message, conversation starters, and commands for a phone number.</p>
     * 
     * @param request UpdateConversationalAutomationRequest
     * @return UpdateConversationalAutomationResponse
     */
    public UpdateConversationalAutomationResponse updateConversationalAutomation(UpdateConversationalAutomationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConversationalAutomationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The China Mobile (China) QPS limit for this API is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Manage your calls appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the content of a flow by using JSON.</p>
     * 
     * @param request UpdateFlowJSONAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowJSONAssetResponse
     */
    public UpdateFlowJSONAssetResponse updateFlowJSONAssetWithOptions(UpdateFlowJSONAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowJSONAsset"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowJSONAssetResponse());
    }

    /**
     * <b>description</b> :
     * <p>The China Mobile (China) QPS limit for this API is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Manage your calls appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the content of a flow by using JSON.</p>
     * 
     * @param request UpdateFlowJSONAssetRequest
     * @return UpdateFlowJSONAssetResponse
     */
    public UpdateFlowJSONAssetResponse updateFlowJSONAsset(UpdateFlowJSONAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlowJSONAssetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update the DSL data of a flow version. You can also update the DSL data on the orchestration canvas in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>. To access the canvas, click the name of the flow.</li>
     * <li>Before calling this operation, make sure that you have created a flow and its status is Unpublished.</li>
     * <li>If you have not created a flow, you can manually create one in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> or call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the Domain-Specific Language (DSL) data of a flow version on the canvas.</p>
     * 
     * @param tmpReq UpdateFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowVersionResponse
     */
    public UpdateFlowVersionResponse updateFlowVersionWithOptions(UpdateFlowVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFlowVersionShrinkRequest request = new UpdateFlowVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizExtend)) {
            request.bizExtendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizExtend, "BizExtend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizExtendShrink)) {
            query.put("BizExtend", request.bizExtendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowCode)) {
            query.put("FlowCode", request.flowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowViewModel)) {
            query.put("FlowViewModel", request.flowViewModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowVersion"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowVersionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update the DSL data of a flow version. You can also update the DSL data on the orchestration canvas in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>. To access the canvas, click the name of the flow.</li>
     * <li>Before calling this operation, make sure that you have created a flow and its status is Unpublished.</li>
     * <li>If you have not created a flow, you can manually create one in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> or call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the Domain-Specific Language (DSL) data of a flow version on the canvas.</p>
     * 
     * @param request UpdateFlowVersionRequest
     * @return UpdateFlowVersionResponse
     */
    public UpdateFlowVersionResponse updateFlowVersion(UpdateFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>群组改名</p>
     * 
     * @param request UpdateGroupNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupNameResponse
     */
    public UpdateGroupNameResponse updateGroupNameWithOptions(UpdateGroupNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupName"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>群组改名</p>
     * 
     * @param request UpdateGroupNameRequest
     * @return UpdateGroupNameResponse
     */
    public UpdateGroupNameResponse updateGroupName(UpdateGroupNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the specified instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactMail)) {
            query.put("ContactMail", request.contactMail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facebookBmId)) {
            query.put("FacebookBmId", request.facebookBmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            query.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isConfirmAudit)) {
            query.put("IsConfirmAudit", request.isConfirmAudit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvTerms)) {
            query.put("IsvTerms", request.isvTerms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeAddress)) {
            query.put("OfficeAddress", request.officeAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the specified instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies campaign information.</p>
     * 
     * @param tmpReq UpdateMarketingFLowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMarketingFLowResponse
     */
    public UpdateMarketingFLowResponse updateMarketingFLowWithOptions(UpdateMarketingFLowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMarketingFLowShrinkRequest request = new UpdateMarketingFLowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityCode)) {
            query.put("ActivityCode", request.activityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityDesc)) {
            query.put("ActivityDesc", request.activityDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityName)) {
            query.put("ActivityName", request.activityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionType)) {
            query.put("ExecutionType", request.executionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramFlag)) {
            query.put("ParamFlag", request.paramFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            query.put("Params", request.paramsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedFlowCode)) {
            query.put("RelatedFlowCode", request.relatedFlowCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedFlowName)) {
            query.put("RelatedFlowName", request.relatedFlowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedGroupId)) {
            query.put("RelatedGroupId", request.relatedGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMarketingFLow"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMarketingFLowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies campaign information.</p>
     * 
     * @param request UpdateMarketingFLowRequest
     * @return UpdateMarketingFLowResponse
     */
    public UpdateMarketingFLowResponse updateMarketingFLow(UpdateMarketingFLowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMarketingFLowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that a phone number has been added under your WABA and has passed phone number verification.</li>
     * <li>If no phone number has been added under your WABA, call the <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> operations to obtain a verification code and register a phone number.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the encryption public key of a phone number.</p>
     * 
     * @param request UpdatePhoneEncryptionPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePhoneEncryptionPublicKeyResponse
     */
    public UpdatePhoneEncryptionPublicKeyResponse updatePhoneEncryptionPublicKeyWithOptions(UpdatePhoneEncryptionPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionPublicKey)) {
            query.put("EncryptionPublicKey", request.encryptionPublicKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhoneEncryptionPublicKey"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhoneEncryptionPublicKeyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that a phone number has been added under your WABA and has passed phone number verification.</li>
     * <li>If no phone number has been added under your WABA, call the <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> operations to obtain a verification code and register a phone number.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the encryption public key of a phone number.</p>
     * 
     * @param request UpdatePhoneEncryptionPublicKeyRequest
     * @return UpdatePhoneEncryptionPublicKeyResponse
     */
    public UpdatePhoneEncryptionPublicKeyResponse updatePhoneEncryptionPublicKey(UpdatePhoneEncryptionPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePhoneEncryptionPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you modify a message QR code, users can no longer open the corresponding business phone number by scanning the original QR code. Proceed with caution.</li>
     * <li>Before calling this operation, make sure that you have created a message QR code.</li>
     * <li>If you have not created a message QR code, call the <a href="https://help.aliyun.com/document_detail/2638749.html">CreatePhoneMessageQrdl</a> operation to create one first.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a message QR code.</p>
     * 
     * @param request UpdatePhoneMessageQrdlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePhoneMessageQrdlResponse
     */
    public UpdatePhoneMessageQrdlResponse updatePhoneMessageQrdlWithOptions(UpdatePhoneMessageQrdlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateQrImage)) {
            query.put("GenerateQrImage", request.generateQrImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefilledMessage)) {
            query.put("PrefilledMessage", request.prefilledMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qrdlCode)) {
            query.put("QrdlCode", request.qrdlCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhoneMessageQrdl"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhoneMessageQrdlResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you modify a message QR code, users can no longer open the corresponding business phone number by scanning the original QR code. Proceed with caution.</li>
     * <li>Before calling this operation, make sure that you have created a message QR code.</li>
     * <li>If you have not created a message QR code, call the <a href="https://help.aliyun.com/document_detail/2638749.html">CreatePhoneMessageQrdl</a> operation to create one first.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a message QR code.</p>
     * 
     * @param request UpdatePhoneMessageQrdlRequest
     * @return UpdatePhoneMessageQrdlResponse
     */
    public UpdatePhoneMessageQrdlResponse updatePhoneMessageQrdl(UpdatePhoneMessageQrdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePhoneMessageQrdlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The per-user QPS limit for this API is 10 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the callback URL information for a phone number.</p>
     * 
     * @param request UpdatePhoneWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePhoneWebhookResponse
     */
    public UpdatePhoneWebhookResponse updatePhoneWebhookWithOptions(UpdatePhoneWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpFlag)) {
            query.put("HttpFlag", request.httpFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueFlag)) {
            query.put("QueueFlag", request.queueFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCallbackUrl)) {
            query.put("StatusCallbackUrl", request.statusCallbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upCallbackUrl)) {
            query.put("UpCallbackUrl", request.upCallbackUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhoneWebhook"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhoneWebhookResponse());
    }

    /**
     * <b>description</b> :
     * <p>The per-user QPS limit for this API is 10 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the callback URL information for a phone number.</p>
     * 
     * @param request UpdatePhoneWebhookRequest
     * @return UpdatePhoneWebhookResponse
     */
    public UpdatePhoneWebhookResponse updatePhoneWebhook(UpdatePhoneWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePhoneWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the MML status of a WABA.</p>
     * 
     * @param request UpdateWabaMmlStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWabaMmlStatusResponse
     */
    public UpdateWabaMmlStatusResponse updateWabaMmlStatusWithOptions(UpdateWabaMmlStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wabaId)) {
            query.put("WabaId", request.wabaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWabaMmlStatus"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWabaMmlStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the MML status of a WABA.</p>
     * 
     * @param request UpdateWabaMmlStatusRequest
     * @return UpdateWabaMmlStatusResponse
     */
    public UpdateWabaMmlStatusResponse updateWabaMmlStatus(UpdateWabaMmlStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWabaMmlStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the WhatsApp username for a business phone number.</p>
     * 
     * @param request UpdateWhatsappUserNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWhatsappUserNameResponse
     */
    public UpdateWhatsappUserNameResponse updateWhatsappUserNameWithOptions(UpdateWhatsappUserNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferAction)) {
            query.put("TransferAction", request.transferAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWhatsappUserName"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWhatsappUserNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the WhatsApp username for a business phone number.</p>
     * 
     * @param request UpdateWhatsappUserNameRequest
     * @return UpdateWhatsappUserNameResponse
     */
    public UpdateWhatsappUserNameResponse updateWhatsappUserName(UpdateWhatsappUserNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWhatsappUserNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Places, answers, or ends WhatsApp voice calls.</p>
     * 
     * @param tmpReq WhatsappCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WhatsappCallResponse
     */
    public WhatsappCallResponse whatsappCallWithOptions(WhatsappCallRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        WhatsappCallShrinkRequest request = new WhatsappCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.session)) {
            request.sessionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.session, "Session", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessNumber)) {
            query.put("BusinessNumber", request.businessNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callAction)) {
            query.put("CallAction", request.callAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custSpaceId)) {
            query.put("CustSpaceId", request.custSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionShrink)) {
            query.put("Session", request.sessionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNumber)) {
            query.put("UserNumber", request.userNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WhatsappCall"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WhatsappCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Places, answers, or ends WhatsApp voice calls.</p>
     * 
     * @param request WhatsappCallRequest
     * @return WhatsappCallResponse
     */
    public WhatsappCallResponse whatsappCall(WhatsappCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.whatsappCallWithOptions(request, runtime);
    }
}
