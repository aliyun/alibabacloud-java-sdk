// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705;

import com.aliyun.tea.*;
import com.aliyun.ccc20170705.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-south-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ccc.aliyuncs.com"),
            new TeaPair("cn-beijing", "ccc.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ccc.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ccc.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ccc.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ccc.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ccc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ccc.aliyuncs.com"),
            new TeaPair("eu-central-1", "ccc.aliyuncs.com"),
            new TeaPair("eu-west-1", "ccc.aliyuncs.com"),
            new TeaPair("me-east-1", "ccc.aliyuncs.com"),
            new TeaPair("us-east-1", "ccc.aliyuncs.com"),
            new TeaPair("us-west-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ccc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ccc.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ccc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbortPredictiveJobsResponse abortPredictiveJobsWithOptions(AbortPredictiveJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AbortPredictiveJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new AbortPredictiveJobsResponse());
    }

    public AbortPredictiveJobsResponse abortPredictiveJobs(AbortPredictiveJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.abortPredictiveJobsWithOptions(request, runtime);
    }

    public AddAgentDeviceResponse addAgentDeviceWithOptions(AddAgentDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAgentDevice", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new AddAgentDeviceResponse());
    }

    public AddAgentDeviceResponse addAgentDevice(AddAgentDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAgentDeviceWithOptions(request, runtime);
    }

    public AddBulkPhoneNumbersResponse addBulkPhoneNumbersWithOptions(AddBulkPhoneNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBulkPhoneNumbers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new AddBulkPhoneNumbersResponse());
    }

    public AddBulkPhoneNumbersResponse addBulkPhoneNumbers(AddBulkPhoneNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBulkPhoneNumbersWithOptions(request, runtime);
    }

    public AddJobsToPredictiveJobGroupResponse addJobsToPredictiveJobGroupWithOptions(AddJobsToPredictiveJobGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddJobsToPredictiveJobGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new AddJobsToPredictiveJobGroupResponse());
    }

    public AddJobsToPredictiveJobGroupResponse addJobsToPredictiveJobGroup(AddJobsToPredictiveJobGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addJobsToPredictiveJobGroupWithOptions(request, runtime);
    }

    public AddPhoneNumberResponse addPhoneNumberWithOptions(AddPhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPhoneNumber", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new AddPhoneNumberResponse());
    }

    public AddPhoneNumberResponse addPhoneNumber(AddPhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPhoneNumberWithOptions(request, runtime);
    }

    public AddPhoneTagsResponse addPhoneTagsWithOptions(AddPhoneTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPhoneTags", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new AddPhoneTagsResponse());
    }

    public AddPhoneTagsResponse addPhoneTags(AddPhoneTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPhoneTagsWithOptions(request, runtime);
    }

    public AssignJobsResponse assignJobsWithOptions(AssignJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssignJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new AssignJobsResponse());
    }

    public AssignJobsResponse assignJobs(AssignJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignJobsWithOptions(request, runtime);
    }

    public AssignUsersResponse assignUsersWithOptions(AssignUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssignUsers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new AssignUsersResponse());
    }

    public AssignUsersResponse assignUsers(AssignUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignUsersWithOptions(request, runtime);
    }

    public CallOnlinePrivacyNumberResponse callOnlinePrivacyNumberWithOptions(CallOnlinePrivacyNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CallOnlinePrivacyNumber", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CallOnlinePrivacyNumberResponse());
    }

    public CallOnlinePrivacyNumberResponse callOnlinePrivacyNumber(CallOnlinePrivacyNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.callOnlinePrivacyNumberWithOptions(request, runtime);
    }

    public CancelJobsResponse cancelJobsWithOptions(CancelJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CancelJobsResponse());
    }

    public CancelJobsResponse cancelJobs(CancelJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelJobsWithOptions(request, runtime);
    }

    public CheckNumberAvaliableResponse checkNumberAvaliableWithOptions(CheckNumberAvaliableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckNumberAvaliable", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CheckNumberAvaliableResponse());
    }

    public CheckNumberAvaliableResponse checkNumberAvaliable(CheckNumberAvaliableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkNumberAvaliableWithOptions(request, runtime);
    }

    public CommitContactFlowVersionModificationResponse commitContactFlowVersionModificationWithOptions(CommitContactFlowVersionModificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CommitContactFlowVersionModification", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CommitContactFlowVersionModificationResponse());
    }

    public CommitContactFlowVersionModificationResponse commitContactFlowVersionModification(CommitContactFlowVersionModificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commitContactFlowVersionModificationWithOptions(request, runtime);
    }

    public CreateBatchJobsResponse createBatchJobsWithOptions(CreateBatchJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBatchJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBatchJobsResponse());
    }

    public CreateBatchJobsResponse createBatchJobs(CreateBatchJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBatchJobsWithOptions(request, runtime);
    }

    public CreateCabInstanceResponse createCabInstanceWithOptions(CreateCabInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCabInstance", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCabInstanceResponse());
    }

    public CreateCabInstanceResponse createCabInstance(CreateCabInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCabInstanceWithOptions(request, runtime);
    }

    public CreateContactFlowResponse createContactFlowWithOptions(CreateContactFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateContactFlow", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateContactFlowResponse());
    }

    public CreateContactFlowResponse createContactFlow(CreateContactFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createContactFlowWithOptions(request, runtime);
    }

    public CreateFaultResponse createFaultWithOptions(CreateFaultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFault", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFaultResponse());
    }

    public CreateFaultResponse createFault(CreateFaultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFaultWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateJobGroupResponse createJobGroupWithOptions(CreateJobGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateJobGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateJobGroupResponse());
    }

    public CreateJobGroupResponse createJobGroup(CreateJobGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createJobGroupWithOptions(request, runtime);
    }

    public CreateMediaResponse createMediaWithOptions(CreateMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMedia", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMediaResponse());
    }

    public CreateMediaResponse createMedia(CreateMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMediaWithOptions(request, runtime);
    }

    public CreatePredictiveJobGroupResponse createPredictiveJobGroupWithOptions(CreatePredictiveJobGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePredictiveJobGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePredictiveJobGroupResponse());
    }

    public CreatePredictiveJobGroupResponse createPredictiveJobGroup(CreatePredictiveJobGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPredictiveJobGroupWithOptions(request, runtime);
    }

    public CreateScenarioResponse createScenarioWithOptions(CreateScenarioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScenario", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScenarioResponse());
    }

    public CreateScenarioResponse createScenario(CreateScenarioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScenarioWithOptions(request, runtime);
    }

    public CreateScenarioFromTemplateResponse createScenarioFromTemplateWithOptions(CreateScenarioFromTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScenarioFromTemplate", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScenarioFromTemplateResponse());
    }

    public CreateScenarioFromTemplateResponse createScenarioFromTemplate(CreateScenarioFromTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScenarioFromTemplateWithOptions(request, runtime);
    }

    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSkillGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSkillGroupResponse());
    }

    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    public CreateSurveyResponse createSurveyWithOptions(CreateSurveyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSurvey", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSurveyResponse());
    }

    public CreateSurveyResponse createSurvey(CreateSurveyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSurveyWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUser", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateVoiceAppraiseResponse createVoiceAppraiseWithOptions(CreateVoiceAppraiseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVoiceAppraise", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVoiceAppraiseResponse());
    }

    public CreateVoiceAppraiseResponse createVoiceAppraise(CreateVoiceAppraiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVoiceAppraiseWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteJobGroupResponse deleteJobGroupWithOptions(DeleteJobGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteJobGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteJobGroupResponse());
    }

    public DeleteJobGroupResponse deleteJobGroup(DeleteJobGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteJobGroupWithOptions(request, runtime);
    }

    public DeleteMediaResponse deleteMediaWithOptions(DeleteMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMedia", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMediaResponse());
    }

    public DeleteMediaResponse deleteMedia(DeleteMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMediaWithOptions(request, runtime);
    }

    public DeletePhoneTagsResponse deletePhoneTagsWithOptions(DeletePhoneTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePhoneTags", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePhoneTagsResponse());
    }

    public DeletePhoneTagsResponse deletePhoneTags(DeletePhoneTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePhoneTagsWithOptions(request, runtime);
    }

    public DeleteSkillGroupResponse deleteSkillGroupWithOptions(DeleteSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSkillGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSkillGroupResponse());
    }

    public DeleteSkillGroupResponse deleteSkillGroup(DeleteSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSkillGroupWithOptions(request, runtime);
    }

    public DeleteSurveyResponse deleteSurveyWithOptions(DeleteSurveyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSurvey", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSurveyResponse());
    }

    public DeleteSurveyResponse deleteSurvey(DeleteSurveyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSurveyWithOptions(request, runtime);
    }

    public DialExResponse dialExWithOptions(DialExRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DialEx", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DialExResponse());
    }

    public DialExResponse dialEx(DialExRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dialExWithOptions(request, runtime);
    }

    public DialogueResponse dialogueWithOptions(DialogueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Dialogue", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DialogueResponse());
    }

    public DialogueResponse dialogue(DialogueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dialogueWithOptions(request, runtime);
    }

    public DisableTrunkProvidersResponse disableTrunkProvidersWithOptions(DisableTrunkProvidersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableTrunkProviders", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DisableTrunkProvidersResponse());
    }

    public DisableTrunkProvidersResponse disableTrunkProviders(DisableTrunkProvidersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableTrunkProvidersWithOptions(request, runtime);
    }

    public DownloadAllTypeRecordingResponse downloadAllTypeRecordingWithOptions(DownloadAllTypeRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadAllTypeRecording", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadAllTypeRecordingResponse());
    }

    public DownloadAllTypeRecordingResponse downloadAllTypeRecording(DownloadAllTypeRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadAllTypeRecordingWithOptions(request, runtime);
    }

    public DownloadCabRecordingResponse downloadCabRecordingWithOptions(DownloadCabRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadCabRecording", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadCabRecordingResponse());
    }

    public DownloadCabRecordingResponse downloadCabRecording(DownloadCabRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadCabRecordingWithOptions(request, runtime);
    }

    public DownloadOriginalStatisticsReportResponse downloadOriginalStatisticsReportWithOptions(DownloadOriginalStatisticsReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadOriginalStatisticsReport", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadOriginalStatisticsReportResponse());
    }

    public DownloadOriginalStatisticsReportResponse downloadOriginalStatisticsReport(DownloadOriginalStatisticsReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadOriginalStatisticsReportWithOptions(request, runtime);
    }

    public DownloadRecordingResponse downloadRecordingWithOptions(DownloadRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadRecording", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadRecordingResponse());
    }

    public DownloadRecordingResponse downloadRecording(DownloadRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadRecordingWithOptions(request, runtime);
    }

    public DownloadUnreachableContactsResponse downloadUnreachableContactsWithOptions(DownloadUnreachableContactsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadUnreachableContacts", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadUnreachableContactsResponse());
    }

    public DownloadUnreachableContactsResponse downloadUnreachableContacts(DownloadUnreachableContactsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadUnreachableContactsWithOptions(request, runtime);
    }

    public FindUsersResponse findUsersWithOptions(FindUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindUsers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new FindUsersResponse());
    }

    public FindUsersResponse findUsers(FindUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findUsersWithOptions(request, runtime);
    }

    public GenerateAgentStatisticReportResponse generateAgentStatisticReportWithOptions(GenerateAgentStatisticReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateAgentStatisticReport", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateAgentStatisticReportResponse());
    }

    public GenerateAgentStatisticReportResponse generateAgentStatisticReport(GenerateAgentStatisticReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAgentStatisticReportWithOptions(request, runtime);
    }

    public GetAgentDataResponse getAgentDataWithOptions(GetAgentDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentData", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetAgentDataResponse());
    }

    public GetAgentDataResponse getAgentData(GetAgentDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentDataWithOptions(request, runtime);
    }

    public GetCallMeasureSummaryReportResponse getCallMeasureSummaryReportWithOptions(GetCallMeasureSummaryReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCallMeasureSummaryReport", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetCallMeasureSummaryReportResponse());
    }

    public GetCallMeasureSummaryReportResponse getCallMeasureSummaryReport(GetCallMeasureSummaryReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCallMeasureSummaryReportWithOptions(request, runtime);
    }

    public GetConfigResponse getConfigWithOptions(GetConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConfig", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetConfigResponse());
    }

    public GetConfigResponse getConfig(GetConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigWithOptions(request, runtime);
    }

    public GetContactInfoByOutboundTaskIdResponse getContactInfoByOutboundTaskIdWithOptions(GetContactInfoByOutboundTaskIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetContactInfoByOutboundTaskId", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetContactInfoByOutboundTaskIdResponse());
    }

    public GetContactInfoByOutboundTaskIdResponse getContactInfoByOutboundTaskId(GetContactInfoByOutboundTaskIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getContactInfoByOutboundTaskIdWithOptions(request, runtime);
    }

    public GetConversationDetailByContactIdResponse getConversationDetailByContactIdWithOptions(GetConversationDetailByContactIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConversationDetailByContactId", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetConversationDetailByContactIdResponse());
    }

    public GetConversationDetailByContactIdResponse getConversationDetailByContactId(GetConversationDetailByContactIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConversationDetailByContactIdWithOptions(request, runtime);
    }

    public GetConversationListResponse getConversationListWithOptions(GetConversationListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConversationList", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetConversationListResponse());
    }

    public GetConversationListResponse getConversationList(GetConversationListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConversationListWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstance", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetInstanceStateResponse getInstanceStateWithOptions(GetInstanceStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceState", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceStateResponse());
    }

    public GetInstanceStateResponse getInstanceState(GetInstanceStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceStateWithOptions(request, runtime);
    }

    public GetInstanceSummaryReportResponse getInstanceSummaryReportWithOptions(GetInstanceSummaryReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceSummaryReport", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceSummaryReportResponse());
    }

    public GetInstanceSummaryReportResponse getInstanceSummaryReport(GetInstanceSummaryReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceSummaryReportWithOptions(request, runtime);
    }

    public GetInstanceSummaryReportByIntervalResponse getInstanceSummaryReportByIntervalWithOptions(GetInstanceSummaryReportByIntervalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceSummaryReportByInterval", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceSummaryReportByIntervalResponse());
    }

    public GetInstanceSummaryReportByIntervalResponse getInstanceSummaryReportByInterval(GetInstanceSummaryReportByIntervalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceSummaryReportByIntervalWithOptions(request, runtime);
    }

    public GetInstanceSummaryReportSinceMidnightResponse getInstanceSummaryReportSinceMidnightWithOptions(GetInstanceSummaryReportSinceMidnightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceSummaryReportSinceMidnight", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceSummaryReportSinceMidnightResponse());
    }

    public GetInstanceSummaryReportSinceMidnightResponse getInstanceSummaryReportSinceMidnight(GetInstanceSummaryReportSinceMidnightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceSummaryReportSinceMidnightWithOptions(request, runtime);
    }

    public GetJobResponse getJobWithOptions(GetJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJob", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobResponse());
    }

    public GetJobResponse getJob(GetJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobWithOptions(request, runtime);
    }

    public GetJobDataUploadParamsResponse getJobDataUploadParamsWithOptions(GetJobDataUploadParamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobDataUploadParams", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobDataUploadParamsResponse());
    }

    public GetJobDataUploadParamsResponse getJobDataUploadParams(GetJobDataUploadParamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobDataUploadParamsWithOptions(request, runtime);
    }

    public GetJobFileUploadUrlResponse getJobFileUploadUrlWithOptions(GetJobFileUploadUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobFileUploadUrl", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobFileUploadUrlResponse());
    }

    public GetJobFileUploadUrlResponse getJobFileUploadUrl(GetJobFileUploadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobFileUploadUrlWithOptions(request, runtime);
    }

    public GetJobGroupResponse getJobGroupWithOptions(GetJobGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobGroupResponse());
    }

    public GetJobGroupResponse getJobGroup(GetJobGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobGroupWithOptions(request, runtime);
    }

    public GetJobListResponse getJobListWithOptions(GetJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobList", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobListResponse());
    }

    public GetJobListResponse getJobList(GetJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobListWithOptions(request, runtime);
    }

    public GetJobStatusByCallIdResponse getJobStatusByCallIdWithOptions(GetJobStatusByCallIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobStatusByCallId", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobStatusByCallIdResponse());
    }

    public GetJobStatusByCallIdResponse getJobStatusByCallId(GetJobStatusByCallIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobStatusByCallIdWithOptions(request, runtime);
    }

    public GetJobTemplateDownloadParamsResponse getJobTemplateDownloadParamsWithOptions(GetJobTemplateDownloadParamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobTemplateDownloadParams", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobTemplateDownloadParamsResponse());
    }

    public GetJobTemplateDownloadParamsResponse getJobTemplateDownloadParams(GetJobTemplateDownloadParamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobTemplateDownloadParamsWithOptions(request, runtime);
    }

    public GetNumberRegionInfoResponse getNumberRegionInfoWithOptions(GetNumberRegionInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNumberRegionInfo", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetNumberRegionInfoResponse());
    }

    public GetNumberRegionInfoResponse getNumberRegionInfo(GetNumberRegionInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNumberRegionInfoWithOptions(request, runtime);
    }

    public GetPredictiveJobGroupResponse getPredictiveJobGroupWithOptions(GetPredictiveJobGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPredictiveJobGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetPredictiveJobGroupResponse());
    }

    public GetPredictiveJobGroupResponse getPredictiveJobGroup(GetPredictiveJobGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPredictiveJobGroupWithOptions(request, runtime);
    }

    public GetPredictiveTaskDataResponse getPredictiveTaskDataWithOptions(GetPredictiveTaskDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPredictiveTaskData", "2017-07-05", "HTTPS", "GET", "AK", "json", req, runtime), new GetPredictiveTaskDataResponse());
    }

    public GetPredictiveTaskDataResponse getPredictiveTaskData(GetPredictiveTaskDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPredictiveTaskDataWithOptions(request, runtime);
    }

    public GetRecordOssUploadParamResponse getRecordOssUploadParamWithOptions(GetRecordOssUploadParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRecordOssUploadParam", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetRecordOssUploadParamResponse());
    }

    public GetRecordOssUploadParamResponse getRecordOssUploadParam(GetRecordOssUploadParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRecordOssUploadParamWithOptions(request, runtime);
    }

    public GetRoutePointResponse getRoutePointWithOptions(GetRoutePointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRoutePoint", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetRoutePointResponse());
    }

    public GetRoutePointResponse getRoutePoint(GetRoutePointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoutePointWithOptions(request, runtime);
    }

    public GetScenarioResponse getScenarioWithOptions(GetScenarioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScenario", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetScenarioResponse());
    }

    public GetScenarioResponse getScenario(GetScenarioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScenarioWithOptions(request, runtime);
    }

    public GetServiceExtensionsResponse getServiceExtensionsWithOptions(GetServiceExtensionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceExtensions", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceExtensionsResponse());
    }

    public GetServiceExtensionsResponse getServiceExtensions(GetServiceExtensionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceExtensionsWithOptions(request, runtime);
    }

    public GetSmsConfigResponse getSmsConfigWithOptions(GetSmsConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSmsConfig", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetSmsConfigResponse());
    }

    public GetSmsConfigResponse getSmsConfig(GetSmsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSmsConfigWithOptions(request, runtime);
    }

    public GetSurveyResponse getSurveyWithOptions(GetSurveyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSurvey", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetSurveyResponse());
    }

    public GetSurveyResponse getSurvey(GetSurveyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSurveyWithOptions(request, runtime);
    }

    public GetTURNCredentialsResponse getTURNCredentialsWithOptions(GetTURNCredentialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTURNCredentials", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetTURNCredentialsResponse());
    }

    public GetTURNCredentialsResponse getTURNCredentials(GetTURNCredentialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTURNCredentialsWithOptions(request, runtime);
    }

    public GetTURNServerListResponse getTURNServerListWithOptions(GetTURNServerListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTURNServerList", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetTURNServerListResponse());
    }

    public GetTURNServerListResponse getTURNServerList(GetTURNServerListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTURNServerListWithOptions(request, runtime);
    }

    public GetTaskListResponse getTaskListWithOptions(GetTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskList", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskListResponse());
    }

    public GetTaskListResponse getTaskList(GetTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskListWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUser", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public GetUserByExtensionResponse getUserByExtensionWithOptions(GetUserByExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserByExtension", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserByExtensionResponse());
    }

    public GetUserByExtensionResponse getUserByExtension(GetUserByExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserByExtensionWithOptions(request, runtime);
    }

    public InflightTaskTimeoutResponse inflightTaskTimeoutWithOptions(InflightTaskTimeoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InflightTaskTimeout", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new InflightTaskTimeoutResponse());
    }

    public InflightTaskTimeoutResponse inflightTaskTimeout(InflightTaskTimeoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.inflightTaskTimeoutWithOptions(request, runtime);
    }

    public LaunchAppraiseResponse launchAppraiseWithOptions(LaunchAppraiseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LaunchAppraise", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new LaunchAppraiseResponse());
    }

    public LaunchAppraiseResponse launchAppraise(LaunchAppraiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.launchAppraiseWithOptions(request, runtime);
    }

    public LaunchShortMessageAppraiseResponse launchShortMessageAppraiseWithOptions(LaunchShortMessageAppraiseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LaunchShortMessageAppraise", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new LaunchShortMessageAppraiseResponse());
    }

    public LaunchShortMessageAppraiseResponse launchShortMessageAppraise(LaunchShortMessageAppraiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.launchShortMessageAppraiseWithOptions(request, runtime);
    }

    public ListAgentDevicesResponse listAgentDevicesWithOptions(ListAgentDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentDevices", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListAgentDevicesResponse());
    }

    public ListAgentDevicesResponse listAgentDevices(ListAgentDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentDevicesWithOptions(request, runtime);
    }

    public ListAgentEventsResponse listAgentEventsWithOptions(ListAgentEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentEvents", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListAgentEventsResponse());
    }

    public ListAgentEventsResponse listAgentEvents(ListAgentEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentEventsWithOptions(request, runtime);
    }

    public ListAgentStateLogsResponse listAgentStateLogsWithOptions(ListAgentStateLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentStateLogs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListAgentStateLogsResponse());
    }

    public ListAgentStateLogsResponse listAgentStateLogs(ListAgentStateLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentStateLogsWithOptions(request, runtime);
    }

    public ListAgentStatesResponse listAgentStatesWithOptions(ListAgentStatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentStates", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListAgentStatesResponse());
    }

    public ListAgentStatesResponse listAgentStates(ListAgentStatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentStatesWithOptions(request, runtime);
    }

    public ListAgentSummaryReportsResponse listAgentSummaryReportsWithOptions(ListAgentSummaryReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentSummaryReports", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListAgentSummaryReportsResponse());
    }

    public ListAgentSummaryReportsResponse listAgentSummaryReports(ListAgentSummaryReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentSummaryReportsWithOptions(request, runtime);
    }

    public ListAgentSummaryReportsByIntervalResponse listAgentSummaryReportsByIntervalWithOptions(ListAgentSummaryReportsByIntervalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentSummaryReportsByInterval", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListAgentSummaryReportsByIntervalResponse());
    }

    public ListAgentSummaryReportsByIntervalResponse listAgentSummaryReportsByInterval(ListAgentSummaryReportsByIntervalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentSummaryReportsByIntervalWithOptions(request, runtime);
    }

    public ListAgentSummaryReportsSinceMidnightResponse listAgentSummaryReportsSinceMidnightWithOptions(ListAgentSummaryReportsSinceMidnightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentSummaryReportsSinceMidnight", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListAgentSummaryReportsSinceMidnightResponse());
    }

    public ListAgentSummaryReportsSinceMidnightResponse listAgentSummaryReportsSinceMidnight(ListAgentSummaryReportsSinceMidnightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentSummaryReportsSinceMidnightWithOptions(request, runtime);
    }

    public ListBasicStatisticsReportSubItemsResponse listBasicStatisticsReportSubItemsWithOptions(ListBasicStatisticsReportSubItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBasicStatisticsReportSubItems", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListBasicStatisticsReportSubItemsResponse());
    }

    public ListBasicStatisticsReportSubItemsResponse listBasicStatisticsReportSubItems(ListBasicStatisticsReportSubItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBasicStatisticsReportSubItemsWithOptions(request, runtime);
    }

    public ListCallDetailRecordsResponse listCallDetailRecordsWithOptions(ListCallDetailRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCallDetailRecords", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListCallDetailRecordsResponse());
    }

    public ListCallDetailRecordsResponse listCallDetailRecords(ListCallDetailRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCallDetailRecordsWithOptions(request, runtime);
    }

    public ListCallEventDetailByContactIdResponse listCallEventDetailByContactIdWithOptions(ListCallEventDetailByContactIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCallEventDetailByContactId", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListCallEventDetailByContactIdResponse());
    }

    public ListCallEventDetailByContactIdResponse listCallEventDetailByContactId(ListCallEventDetailByContactIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCallEventDetailByContactIdWithOptions(request, runtime);
    }

    public ListCallMeasureSummaryReportsResponse listCallMeasureSummaryReportsWithOptions(ListCallMeasureSummaryReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCallMeasureSummaryReports", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListCallMeasureSummaryReportsResponse());
    }

    public ListCallMeasureSummaryReportsResponse listCallMeasureSummaryReports(ListCallMeasureSummaryReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCallMeasureSummaryReportsWithOptions(request, runtime);
    }

    public ListConfigResponse listConfigWithOptions(ListConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConfig", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListConfigResponse());
    }

    public ListConfigResponse listConfig(ListConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigWithOptions(request, runtime);
    }

    public ListContactFlowsResponse listContactFlowsWithOptions(ListContactFlowsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListContactFlows", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListContactFlowsResponse());
    }

    public ListContactFlowsResponse listContactFlows(ListContactFlowsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listContactFlowsWithOptions(request, runtime);
    }

    public ListInstancesOfUserResponse listInstancesOfUserWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListInstancesOfUser", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstancesOfUserResponse());
    }

    public ListInstancesOfUserResponse listInstancesOfUser() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesOfUserWithOptions(runtime);
    }

    public ListIvrTrackingDetailResponse listIvrTrackingDetailWithOptions(ListIvrTrackingDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIvrTrackingDetail", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListIvrTrackingDetailResponse());
    }

    public ListIvrTrackingDetailResponse listIvrTrackingDetail(ListIvrTrackingDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIvrTrackingDetailWithOptions(request, runtime);
    }

    public ListJobGroupsResponse listJobGroupsWithOptions(ListJobGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobGroups", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobGroupsResponse());
    }

    public ListJobGroupsResponse listJobGroups(ListJobGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobGroupsWithOptions(request, runtime);
    }

    public ListJobStatusResponse listJobStatusWithOptions(ListJobStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobStatus", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobStatusResponse());
    }

    public ListJobStatusResponse listJobStatus(ListJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobStatusWithOptions(request, runtime);
    }

    public ListJobsByGroupResponse listJobsByGroupWithOptions(ListJobsByGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobsByGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobsByGroupResponse());
    }

    public ListJobsByGroupResponse listJobsByGroup(ListJobsByGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobsByGroupWithOptions(request, runtime);
    }

    public ListMediasResponse listMediasWithOptions(ListMediasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMedias", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListMediasResponse());
    }

    public ListMediasResponse listMedias(ListMediasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediasWithOptions(request, runtime);
    }

    public ListOutboundPhoneNumberOfUserResponse listOutboundPhoneNumberOfUserWithOptions(ListOutboundPhoneNumberOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOutboundPhoneNumberOfUser", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListOutboundPhoneNumberOfUserResponse());
    }

    public ListOutboundPhoneNumberOfUserResponse listOutboundPhoneNumberOfUser(ListOutboundPhoneNumberOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOutboundPhoneNumberOfUserWithOptions(request, runtime);
    }

    public ListPhoneNumbersResponse listPhoneNumbersWithOptions(ListPhoneNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhoneNumbers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhoneNumbersResponse());
    }

    public ListPhoneNumbersResponse listPhoneNumbers(ListPhoneNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhoneNumbersWithOptions(request, runtime);
    }

    public ListPhoneTagsResponse listPhoneTagsWithOptions(ListPhoneTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhoneTags", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhoneTagsResponse());
    }

    public ListPhoneTagsResponse listPhoneTags(ListPhoneTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhoneTagsWithOptions(request, runtime);
    }

    public ListRealTimeAgentResponse listRealTimeAgentWithOptions(ListRealTimeAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRealTimeAgent", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListRealTimeAgentResponse());
    }

    public ListRealTimeAgentResponse listRealTimeAgent(ListRealTimeAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRealTimeAgentWithOptions(request, runtime);
    }

    public ListRecentCallRecordsResponse listRecentCallRecordsWithOptions(ListRecentCallRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRecentCallRecords", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListRecentCallRecordsResponse());
    }

    public ListRecentCallRecordsResponse listRecentCallRecords(ListRecentCallRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRecentCallRecordsWithOptions(request, runtime);
    }

    public ListRecordingOfDualTrackResponse listRecordingOfDualTrackWithOptions(ListRecordingOfDualTrackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRecordingOfDualTrack", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListRecordingOfDualTrackResponse());
    }

    public ListRecordingOfDualTrackResponse listRecordingOfDualTrack(ListRecordingOfDualTrackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRecordingOfDualTrackWithOptions(request, runtime);
    }

    public ListRecordingsResponse listRecordingsWithOptions(ListRecordingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRecordings", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListRecordingsResponse());
    }

    public ListRecordingsResponse listRecordings(ListRecordingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRecordingsWithOptions(request, runtime);
    }

    public ListRecordingsByContactIdResponse listRecordingsByContactIdWithOptions(ListRecordingsByContactIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRecordingsByContactId", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListRecordingsByContactIdResponse());
    }

    public ListRecordingsByContactIdResponse listRecordingsByContactId(ListRecordingsByContactIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRecordingsByContactIdWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRoles", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public ListScenarioTemplatesResponse listScenarioTemplatesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListScenarioTemplates", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListScenarioTemplatesResponse());
    }

    public ListScenarioTemplatesResponse listScenarioTemplates() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScenarioTemplatesWithOptions(runtime);
    }

    public ListScenariosResponse listScenariosWithOptions(ListScenariosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScenarios", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListScenariosResponse());
    }

    public ListScenariosResponse listScenarios(ListScenariosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScenariosWithOptions(request, runtime);
    }

    public ListSkillGroupStatesResponse listSkillGroupStatesWithOptions(ListSkillGroupStatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroupStates", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillGroupStatesResponse());
    }

    public ListSkillGroupStatesResponse listSkillGroupStates(ListSkillGroupStatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupStatesWithOptions(request, runtime);
    }

    public ListSkillGroupSummaryReportsResponse listSkillGroupSummaryReportsWithOptions(ListSkillGroupSummaryReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroupSummaryReports", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillGroupSummaryReportsResponse());
    }

    public ListSkillGroupSummaryReportsResponse listSkillGroupSummaryReports(ListSkillGroupSummaryReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupSummaryReportsWithOptions(request, runtime);
    }

    public ListSkillGroupSummaryReportsByIntervalResponse listSkillGroupSummaryReportsByIntervalWithOptions(ListSkillGroupSummaryReportsByIntervalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroupSummaryReportsByInterval", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillGroupSummaryReportsByIntervalResponse());
    }

    public ListSkillGroupSummaryReportsByIntervalResponse listSkillGroupSummaryReportsByInterval(ListSkillGroupSummaryReportsByIntervalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupSummaryReportsByIntervalWithOptions(request, runtime);
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponse listSkillGroupSummaryReportsSinceMidnightWithOptions(ListSkillGroupSummaryReportsSinceMidnightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroupSummaryReportsSinceMidnight", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillGroupSummaryReportsSinceMidnightResponse());
    }

    public ListSkillGroupSummaryReportsSinceMidnightResponse listSkillGroupSummaryReportsSinceMidnight(ListSkillGroupSummaryReportsSinceMidnightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupSummaryReportsSinceMidnightWithOptions(request, runtime);
    }

    public ListSkillGroupsResponse listSkillGroupsWithOptions(ListSkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroups", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillGroupsResponse());
    }

    public ListSkillGroupsResponse listSkillGroups(ListSkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupsWithOptions(request, runtime);
    }

    public ListSkillGroupsOfUserResponse listSkillGroupsOfUserWithOptions(ListSkillGroupsOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroupsOfUser", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillGroupsOfUserResponse());
    }

    public ListSkillGroupsOfUserResponse listSkillGroupsOfUser(ListSkillGroupsOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupsOfUserWithOptions(request, runtime);
    }

    public ListSurveysResponse listSurveysWithOptions(ListSurveysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSurveys", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListSurveysResponse());
    }

    public ListSurveysResponse listSurveys(ListSurveysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSurveysWithOptions(request, runtime);
    }

    public ListTransferableSkillGroupsResponse listTransferableSkillGroupsWithOptions(ListTransferableSkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTransferableSkillGroups", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListTransferableSkillGroupsResponse());
    }

    public ListTransferableSkillGroupsResponse listTransferableSkillGroups(ListTransferableSkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransferableSkillGroupsWithOptions(request, runtime);
    }

    public ListTrunkProvidersResponse listTrunkProvidersWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListTrunkProviders", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListTrunkProvidersResponse());
    }

    public ListTrunkProvidersResponse listTrunkProviders() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTrunkProvidersWithOptions(runtime);
    }

    public ListTrunksOfSkillGroupResponse listTrunksOfSkillGroupWithOptions(ListTrunksOfSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTrunksOfSkillGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListTrunksOfSkillGroupResponse());
    }

    public ListTrunksOfSkillGroupResponse listTrunksOfSkillGroup(ListTrunksOfSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTrunksOfSkillGroupWithOptions(request, runtime);
    }

    public ListUnreachableContactsResponse listUnreachableContactsWithOptions(ListUnreachableContactsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUnreachableContacts", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListUnreachableContactsResponse());
    }

    public ListUnreachableContactsResponse listUnreachableContacts(ListUnreachableContactsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUnreachableContactsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListUsersOfSkillGroupResponse listUsersOfSkillGroupWithOptions(ListUsersOfSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsersOfSkillGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersOfSkillGroupResponse());
    }

    public ListUsersOfSkillGroupResponse listUsersOfSkillGroup(ListUsersOfSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersOfSkillGroupWithOptions(request, runtime);
    }

    public ListVoiceAppraiseResponse listVoiceAppraiseWithOptions(ListVoiceAppraiseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVoiceAppraise", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListVoiceAppraiseResponse());
    }

    public ListVoiceAppraiseResponse listVoiceAppraise(ListVoiceAppraiseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVoiceAppraiseWithOptions(request, runtime);
    }

    public ModifyAgentDeviceResponse modifyAgentDeviceWithOptions(ModifyAgentDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAgentDevice", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAgentDeviceResponse());
    }

    public ModifyAgentDeviceResponse modifyAgentDevice(ModifyAgentDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAgentDeviceWithOptions(request, runtime);
    }

    public ModifyCabInstanceResponse modifyCabInstanceWithOptions(ModifyCabInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCabInstance", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCabInstanceResponse());
    }

    public ModifyCabInstanceResponse modifyCabInstance(ModifyCabInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCabInstanceWithOptions(request, runtime);
    }

    public ModifyCallRatioResponse modifyCallRatioWithOptions(ModifyCallRatioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCallRatio", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCallRatioResponse());
    }

    public ModifyCallRatioResponse modifyCallRatio(ModifyCallRatioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCallRatioWithOptions(request, runtime);
    }

    public ModifyPhoneNumberResponse modifyPhoneNumberWithOptions(ModifyPhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPhoneNumber", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPhoneNumberResponse());
    }

    public ModifyPhoneNumberResponse modifyPhoneNumber(ModifyPhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPhoneNumberWithOptions(request, runtime);
    }

    public ModifyPhoneTagsResponse modifyPhoneTagsWithOptions(ModifyPhoneTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPhoneTags", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPhoneTagsResponse());
    }

    public ModifyPhoneTagsResponse modifyPhoneTags(ModifyPhoneTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPhoneTagsWithOptions(request, runtime);
    }

    public ModifyPrimaryTrunksOfSkillGroupResponse modifyPrimaryTrunksOfSkillGroupWithOptions(ModifyPrimaryTrunksOfSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPrimaryTrunksOfSkillGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPrimaryTrunksOfSkillGroupResponse());
    }

    public ModifyPrimaryTrunksOfSkillGroupResponse modifyPrimaryTrunksOfSkillGroup(ModifyPrimaryTrunksOfSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPrimaryTrunksOfSkillGroupWithOptions(request, runtime);
    }

    public ModifyPrivacyNumberCallDetailResponse modifyPrivacyNumberCallDetailWithOptions(ModifyPrivacyNumberCallDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPrivacyNumberCallDetail", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPrivacyNumberCallDetailResponse());
    }

    public ModifyPrivacyNumberCallDetailResponse modifyPrivacyNumberCallDetail(ModifyPrivacyNumberCallDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPrivacyNumberCallDetailWithOptions(request, runtime);
    }

    public ModifyScenarioResponse modifyScenarioWithOptions(ModifyScenarioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScenario", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScenarioResponse());
    }

    public ModifyScenarioResponse modifyScenario(ModifyScenarioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScenarioWithOptions(request, runtime);
    }

    public ModifySkillGroupResponse modifySkillGroupWithOptions(ModifySkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySkillGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySkillGroupResponse());
    }

    public ModifySkillGroupResponse modifySkillGroup(ModifySkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySkillGroupWithOptions(request, runtime);
    }

    public ModifySkillGroupOfUserResponse modifySkillGroupOfUserWithOptions(ModifySkillGroupOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySkillGroupOfUser", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySkillGroupOfUserResponse());
    }

    public ModifySkillGroupOfUserResponse modifySkillGroupOfUser(ModifySkillGroupOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySkillGroupOfUserWithOptions(request, runtime);
    }

    public ModifySkillGroupOutboundNumbersResponse modifySkillGroupOutboundNumbersWithOptions(ModifySkillGroupOutboundNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySkillGroupOutboundNumbers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySkillGroupOutboundNumbersResponse());
    }

    public ModifySkillGroupOutboundNumbersResponse modifySkillGroupOutboundNumbers(ModifySkillGroupOutboundNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySkillGroupOutboundNumbersWithOptions(request, runtime);
    }

    public ModifySurveyResponse modifySurveyWithOptions(ModifySurveyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySurvey", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySurveyResponse());
    }

    public ModifySurveyResponse modifySurvey(ModifySurveyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySurveyWithOptions(request, runtime);
    }

    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUser", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserResponse());
    }

    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    public PickGlobalOutboundNumbersResponse pickGlobalOutboundNumbersWithOptions(PickGlobalOutboundNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PickGlobalOutboundNumbers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new PickGlobalOutboundNumbersResponse());
    }

    public PickGlobalOutboundNumbersResponse pickGlobalOutboundNumbers(PickGlobalOutboundNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pickGlobalOutboundNumbersWithOptions(request, runtime);
    }

    public PickLocalNumberResponse pickLocalNumberWithOptions(PickLocalNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PickLocalNumber", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new PickLocalNumberResponse());
    }

    public PickLocalNumberResponse pickLocalNumber(PickLocalNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pickLocalNumberWithOptions(request, runtime);
    }

    public PickOutboundNumbersResponse pickOutboundNumbersWithOptions(PickOutboundNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PickOutboundNumbers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new PickOutboundNumbersResponse());
    }

    public PickOutboundNumbersResponse pickOutboundNumbers(PickOutboundNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pickOutboundNumbersWithOptions(request, runtime);
    }

    public PublishContactFlowVersionResponse publishContactFlowVersionWithOptions(PublishContactFlowVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishContactFlowVersion", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new PublishContactFlowVersionResponse());
    }

    public PublishContactFlowVersionResponse publishContactFlowVersion(PublishContactFlowVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishContactFlowVersionWithOptions(request, runtime);
    }

    public PublishPredictiveJobGroupResponse publishPredictiveJobGroupWithOptions(PublishPredictiveJobGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishPredictiveJobGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new PublishPredictiveJobGroupResponse());
    }

    public PublishPredictiveJobGroupResponse publishPredictiveJobGroup(PublishPredictiveJobGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishPredictiveJobGroupWithOptions(request, runtime);
    }

    public PublishSurveyResponse publishSurveyWithOptions(PublishSurveyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishSurvey", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new PublishSurveyResponse());
    }

    public PublishSurveyResponse publishSurvey(PublishSurveyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishSurveyWithOptions(request, runtime);
    }

    public RefreshTokenResponse refreshTokenWithOptions(RefreshTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshToken", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshTokenResponse());
    }

    public RefreshTokenResponse refreshToken(RefreshTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshTokenWithOptions(request, runtime);
    }

    public RemovePhoneNumberResponse removePhoneNumberWithOptions(RemovePhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemovePhoneNumber", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new RemovePhoneNumberResponse());
    }

    public RemovePhoneNumberResponse removePhoneNumber(RemovePhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removePhoneNumberWithOptions(request, runtime);
    }

    public RemoveUsersResponse removeUsersWithOptions(RemoveUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUsers", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUsersResponse());
    }

    public RemoveUsersResponse removeUsers(RemoveUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUsersWithOptions(request, runtime);
    }

    public RemoveUsersFromSkillGroupResponse removeUsersFromSkillGroupWithOptions(RemoveUsersFromSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUsersFromSkillGroup", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUsersFromSkillGroupResponse());
    }

    public RemoveUsersFromSkillGroupResponse removeUsersFromSkillGroup(RemoveUsersFromSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUsersFromSkillGroupWithOptions(request, runtime);
    }

    public RequestLoginInfoResponse requestLoginInfoWithOptions(RequestLoginInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RequestLoginInfo", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new RequestLoginInfoResponse());
    }

    public RequestLoginInfoResponse requestLoginInfo(RequestLoginInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestLoginInfoWithOptions(request, runtime);
    }

    public ResetUserStatusResponse resetUserStatusWithOptions(ResetUserStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetUserStatus", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ResetUserStatusResponse());
    }

    public ResetUserStatusResponse resetUserStatus(ResetUserStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetUserStatusWithOptions(request, runtime);
    }

    public ResumeJobsResponse resumeJobsWithOptions(ResumeJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeJobsResponse());
    }

    public ResumeJobsResponse resumeJobs(ResumeJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeJobsWithOptions(request, runtime);
    }

    public ResumePredictiveJobsResponse resumePredictiveJobsWithOptions(ResumePredictiveJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumePredictiveJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new ResumePredictiveJobsResponse());
    }

    public ResumePredictiveJobsResponse resumePredictiveJobs(ResumePredictiveJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumePredictiveJobsWithOptions(request, runtime);
    }

    public SaveStatsResponse saveStatsWithOptions(SaveStatsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveStats", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new SaveStatsResponse());
    }

    public SaveStatsResponse saveStats(SaveStatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveStatsWithOptions(request, runtime);
    }

    public SaveTerminalLogResponse saveTerminalLogWithOptions(SaveTerminalLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTerminalLog", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTerminalLogResponse());
    }

    public SaveTerminalLogResponse saveTerminalLog(SaveTerminalLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTerminalLogWithOptions(request, runtime);
    }

    public SaveWebRTCStatsResponse saveWebRTCStatsWithOptions(SaveWebRTCStatsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveWebRTCStats", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new SaveWebRTCStatsResponse());
    }

    public SaveWebRTCStatsResponse saveWebRTCStats(SaveWebRTCStatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveWebRTCStatsWithOptions(request, runtime);
    }

    public SendPredefinedShortMessageResponse sendPredefinedShortMessageWithOptions(SendPredefinedShortMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendPredefinedShortMessage", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new SendPredefinedShortMessageResponse());
    }

    public SendPredefinedShortMessageResponse sendPredefinedShortMessage(SendPredefinedShortMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendPredefinedShortMessageWithOptions(request, runtime);
    }

    public StartBack2BackCallResponse startBack2BackCallWithOptions(StartBack2BackCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartBack2BackCall", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new StartBack2BackCallResponse());
    }

    public StartBack2BackCallResponse startBack2BackCall(StartBack2BackCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startBack2BackCallWithOptions(request, runtime);
    }

    public StartJobResponse startJobWithOptions(StartJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartJob", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new StartJobResponse());
    }

    public StartJobResponse startJob(StartJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startJobWithOptions(request, runtime);
    }

    public SubmitBatchJobsResponse submitBatchJobsWithOptions(SubmitBatchJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitBatchJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitBatchJobsResponse());
    }

    public SubmitBatchJobsResponse submitBatchJobs(SubmitBatchJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitBatchJobsWithOptions(request, runtime);
    }

    public SubmitCabRecordingResponse submitCabRecordingWithOptions(SubmitCabRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitCabRecording", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitCabRecordingResponse());
    }

    public SubmitCabRecordingResponse submitCabRecording(SubmitCabRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitCabRecordingWithOptions(request, runtime);
    }

    public SuspendJobsResponse suspendJobsWithOptions(SuspendJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendJobsResponse());
    }

    public SuspendJobsResponse suspendJobs(SuspendJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendJobsWithOptions(request, runtime);
    }

    public SuspendPredictiveJobsResponse suspendPredictiveJobsWithOptions(SuspendPredictiveJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendPredictiveJobs", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendPredictiveJobsResponse());
    }

    public SuspendPredictiveJobsResponse suspendPredictiveJobs(SuspendPredictiveJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendPredictiveJobsWithOptions(request, runtime);
    }

    public TaskPreparingResponse taskPreparingWithOptions(TaskPreparingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TaskPreparing", "2017-07-05", "HTTPS", "POST", "AK", "json", req, runtime), new TaskPreparingResponse());
    }

    public TaskPreparingResponse taskPreparing(TaskPreparingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.taskPreparingWithOptions(request, runtime);
    }
}
