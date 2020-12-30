// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219;

import com.aliyun.tea.*;
import com.aliyun.cloudauth_console20190219.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth-console", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProject", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public CreateSlrRoleResponse createSlrRoleWithOptions(CreateSlrRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSlrRole", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSlrRoleResponse());
    }

    public CreateSlrRoleResponse createSlrRole(CreateSlrRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSlrRoleWithOptions(request, runtime);
    }

    public DeleteMnsServeResponse deleteMnsServeWithOptions(DeleteMnsServeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMnsServe", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMnsServeResponse());
    }

    public DeleteMnsServeResponse deleteMnsServe(DeleteMnsServeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMnsServeWithOptions(request, runtime);
    }

    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserGroup", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserGroupResponse());
    }

    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    public DeleteUserInfoResponse deleteUserInfoWithOptions(DeleteUserInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserInfo", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserInfoResponse());
    }

    public DeleteUserInfoResponse deleteUserInfo(DeleteUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserInfoWithOptions(request, runtime);
    }

    public DescribeAllEndPointResponse describeAllEndPointWithOptions(DescribeAllEndPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllEndPoint", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllEndPointResponse());
    }

    public DescribeAllEndPointResponse describeAllEndPoint(DescribeAllEndPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllEndPointWithOptions(request, runtime);
    }

    public DescribeBindUserIdListResponse describeBindUserIdListWithOptions(DescribeBindUserIdListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBindUserIdList", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBindUserIdListResponse());
    }

    public DescribeBindUserIdListResponse describeBindUserIdList(DescribeBindUserIdListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBindUserIdListWithOptions(request, runtime);
    }

    public DescribeCertificateTypeListResponse describeCertificateTypeListWithOptions(DescribeCertificateTypeListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCertificateTypeList", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCertificateTypeListResponse());
    }

    public DescribeCertificateTypeListResponse describeCertificateTypeList(DescribeCertificateTypeListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertificateTypeListWithOptions(request, runtime);
    }

    public DescribeDeviceListResponse describeDeviceListWithOptions(DescribeDeviceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceList", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceListResponse());
    }

    public DescribeDeviceListResponse describeDeviceList(DescribeDeviceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceListWithOptions(request, runtime);
    }

    public DescribeExcelAnalysisResultResponse describeExcelAnalysisResultWithOptions(DescribeExcelAnalysisResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExcelAnalysisResult", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExcelAnalysisResultResponse());
    }

    public DescribeExcelAnalysisResultResponse describeExcelAnalysisResult(DescribeExcelAnalysisResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExcelAnalysisResultWithOptions(request, runtime);
    }

    public DescribeIdentifyRecordListResponse describeIdentifyRecordListWithOptions(DescribeIdentifyRecordListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIdentifyRecordList", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIdentifyRecordListResponse());
    }

    public DescribeIdentifyRecordListResponse describeIdentifyRecordList(DescribeIdentifyRecordListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIdentifyRecordListWithOptions(request, runtime);
    }

    public DescribeMnsOauthResponse describeMnsOauthWithOptions(DescribeMnsOauthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMnsOauth", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMnsOauthResponse());
    }

    public DescribeMnsOauthResponse describeMnsOauth(DescribeMnsOauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMnsOauthWithOptions(request, runtime);
    }

    public DescribeOssOauthResponse describeOssOauthWithOptions(DescribeOssOauthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOssOauth", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOssOauthResponse());
    }

    public DescribeOssOauthResponse describeOssOauth(DescribeOssOauthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssOauthWithOptions(request, runtime);
    }

    public DescribeSignedUrlResponse describeSignedUrlWithOptions(DescribeSignedUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSignedUrl", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSignedUrlResponse());
    }

    public DescribeSignedUrlResponse describeSignedUrl(DescribeSignedUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSignedUrlWithOptions(request, runtime);
    }

    public DescribeTopicResponse describeTopicWithOptions(DescribeTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTopic", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTopicResponse());
    }

    public DescribeTopicResponse describeTopic(DescribeTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTopicWithOptions(request, runtime);
    }

    public DescribeUploadPreSignResponse describeUploadPreSignWithOptions(DescribeUploadPreSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUploadPreSign", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUploadPreSignResponse());
    }

    public DescribeUploadPreSignResponse describeUploadPreSign(DescribeUploadPreSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUploadPreSignWithOptions(request, runtime);
    }

    public DescribeUserGroupListResponse describeUserGroupListWithOptions(DescribeUserGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserGroupList", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserGroupListResponse());
    }

    public DescribeUserGroupListResponse describeUserGroupList(DescribeUserGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserGroupListWithOptions(request, runtime);
    }

    public DescribeUserInfoListResponse describeUserInfoListWithOptions(DescribeUserInfoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserInfoList", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserInfoListResponse());
    }

    public DescribeUserInfoListResponse describeUserInfoList(DescribeUserInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserInfoListWithOptions(request, runtime);
    }

    public GetAccountProjectResponse getAccountProjectWithOptions(GetAccountProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAccountProject", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new GetAccountProjectResponse());
    }

    public GetAccountProjectResponse getAccountProject(GetAccountProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountProjectWithOptions(request, runtime);
    }

    public SaveMnsServeResponse saveMnsServeWithOptions(SaveMnsServeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveMnsServe", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new SaveMnsServeResponse());
    }

    public SaveMnsServeResponse saveMnsServe(SaveMnsServeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveMnsServeWithOptions(request, runtime);
    }

    public SaveOssServeResponse saveOssServeWithOptions(SaveOssServeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveOssServe", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new SaveOssServeResponse());
    }

    public SaveOssServeResponse saveOssServe(SaveOssServeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveOssServeWithOptions(request, runtime);
    }

    public SaveUserGroupResponse saveUserGroupWithOptions(SaveUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveUserGroup", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new SaveUserGroupResponse());
    }

    public SaveUserGroupResponse saveUserGroup(SaveUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveUserGroupWithOptions(request, runtime);
    }

    public SaveUserInfoResponse saveUserInfoWithOptions(SaveUserInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveUserInfo", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new SaveUserInfoResponse());
    }

    public SaveUserInfoResponse saveUserInfo(SaveUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveUserInfoWithOptions(request, runtime);
    }

    public UnbindDeviceResponse unbindDeviceWithOptions(UnbindDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindDevice", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindDeviceResponse());
    }

    public UnbindDeviceResponse unbindDevice(UnbindDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindDeviceWithOptions(request, runtime);
    }

    public UpdateDeviceControlInfoResponse updateDeviceControlInfoWithOptions(UpdateDeviceControlInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceControlInfo", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceControlInfoResponse());
    }

    public UpdateDeviceControlInfoResponse updateDeviceControlInfo(UpdateDeviceControlInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceControlInfoWithOptions(request, runtime);
    }

    public UpdateDeviceNameResponse updateDeviceNameWithOptions(UpdateDeviceNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceName", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceNameResponse());
    }

    public UpdateDeviceNameResponse updateDeviceName(UpdateDeviceNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceNameWithOptions(request, runtime);
    }

    public UpdateProjectNameResponse updateProjectNameWithOptions(UpdateProjectNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProjectName", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProjectNameResponse());
    }

    public UpdateProjectNameResponse updateProjectName(UpdateProjectNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProjectNameWithOptions(request, runtime);
    }

    public UpdateUserGroupResponse updateUserGroupWithOptions(UpdateUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUserGroup", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserGroupResponse());
    }

    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserGroupWithOptions(request, runtime);
    }

    public UpdateUserInfoResponse updateUserInfoWithOptions(UpdateUserInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUserInfo", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserInfoResponse());
    }

    public UpdateUserInfoResponse updateUserInfo(UpdateUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserInfoWithOptions(request, runtime);
    }

    public UploadIdentifyRecordResponse uploadIdentifyRecordWithOptions(UploadIdentifyRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadIdentifyRecord", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new UploadIdentifyRecordResponse());
    }

    public UploadIdentifyRecordResponse uploadIdentifyRecord(UploadIdentifyRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadIdentifyRecordWithOptions(request, runtime);
    }

    public VerifyAccountProjectResponse verifyAccountProjectWithOptions(VerifyAccountProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyAccountProject", "2019-02-19", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyAccountProjectResponse());
    }

    public VerifyAccountProjectResponse verifyAccountProject(VerifyAccountProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyAccountProjectWithOptions(request, runtime);
    }
}
