// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123;

import com.aliyun.tea.*;
import com.aliyun.dm20151123.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddIpfilterResponse addIpfilterWithOptions(AddIpfilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddIpfilter", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new AddIpfilterResponse());
    }

    public AddIpfilterResponse addIpfilter(AddIpfilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIpfilterWithOptions(request, runtime);
    }

    public ApproveMailTemplateResponse approveMailTemplateWithOptions(ApproveMailTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApproveMailTemplate", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ApproveMailTemplateResponse());
    }

    public ApproveMailTemplateResponse approveMailTemplate(ApproveMailTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveMailTemplateWithOptions(request, runtime);
    }

    public ApproveReplyMailAddressResponse approveReplyMailAddressWithOptions(ApproveReplyMailAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApproveReplyMailAddress", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ApproveReplyMailAddressResponse());
    }

    public ApproveReplyMailAddressResponse approveReplyMailAddress(ApproveReplyMailAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveReplyMailAddressWithOptions(request, runtime);
    }

    public ApproveSmsTemplateResponse approveSmsTemplateWithOptions(ApproveSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApproveSmsTemplate", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ApproveSmsTemplateResponse());
    }

    public ApproveSmsTemplateResponse approveSmsTemplate(ApproveSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveSmsTemplateWithOptions(request, runtime);
    }

    public ApproveTemplateResponse approveTemplateWithOptions(ApproveTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApproveTemplate", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ApproveTemplateResponse());
    }

    public ApproveTemplateResponse approveTemplate(ApproveTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveTemplateWithOptions(request, runtime);
    }

    public BatchSendMailResponse batchSendMailWithOptions(BatchSendMailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSendMail", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSendMailResponse());
    }

    public BatchSendMailResponse batchSendMail(BatchSendMailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSendMailWithOptions(request, runtime);
    }

    public CheckDomainResponse checkDomainWithOptions(CheckDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDomain", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDomainResponse());
    }

    public CheckDomainResponse checkDomain(CheckDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDomainWithOptions(request, runtime);
    }

    public CheckInvalidAddressResponse checkInvalidAddressWithOptions(CheckInvalidAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckInvalidAddress", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CheckInvalidAddressResponse());
    }

    public CheckInvalidAddressResponse checkInvalidAddress(CheckInvalidAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkInvalidAddressWithOptions(request, runtime);
    }

    public CheckReplyToMailAddressResponse checkReplyToMailAddressWithOptions(CheckReplyToMailAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckReplyToMailAddress", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CheckReplyToMailAddressResponse());
    }

    public CheckReplyToMailAddressResponse checkReplyToMailAddress(CheckReplyToMailAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkReplyToMailAddressWithOptions(request, runtime);
    }

    public CreateDayuResponse createDayuWithOptions(CreateDayuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDayu", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDayuResponse());
    }

    public CreateDayuResponse createDayu(CreateDayuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDayuWithOptions(request, runtime);
    }

    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDomain", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDomainResponse());
    }

    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    public CreateMailAddressResponse createMailAddressWithOptions(CreateMailAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMailAddress", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMailAddressResponse());
    }

    public CreateMailAddressResponse createMailAddress(CreateMailAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMailAddressWithOptions(request, runtime);
    }

    public CreateReceiverResponse createReceiverWithOptions(CreateReceiverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateReceiver", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateReceiverResponse());
    }

    public CreateReceiverResponse createReceiver(CreateReceiverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createReceiverWithOptions(request, runtime);
    }

    public CreateSignResponse createSignWithOptions(CreateSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSign", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSignResponse());
    }

    public CreateSignResponse createSign(CreateSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSignWithOptions(request, runtime);
    }

    public CreateTagResponse createTagWithOptions(CreateTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTag", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTagResponse());
    }

    public CreateTagResponse createTag(CreateTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTagWithOptions(request, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTemplate", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomain", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public DeleteInvalidAddressResponse deleteInvalidAddressWithOptions(DeleteInvalidAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInvalidAddress", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInvalidAddressResponse());
    }

    public DeleteInvalidAddressResponse deleteInvalidAddress(DeleteInvalidAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInvalidAddressWithOptions(request, runtime);
    }

    public DeleteIpfilterByEdmIdResponse deleteIpfilterByEdmIdWithOptions(DeleteIpfilterByEdmIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpfilterByEdmId", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpfilterByEdmIdResponse());
    }

    public DeleteIpfilterByEdmIdResponse deleteIpfilterByEdmId(DeleteIpfilterByEdmIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpfilterByEdmIdWithOptions(request, runtime);
    }

    public DeleteMailAddressResponse deleteMailAddressWithOptions(DeleteMailAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMailAddress", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMailAddressResponse());
    }

    public DeleteMailAddressResponse deleteMailAddress(DeleteMailAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMailAddressWithOptions(request, runtime);
    }

    public DeleteReceiverResponse deleteReceiverWithOptions(DeleteReceiverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteReceiver", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteReceiverResponse());
    }

    public DeleteReceiverResponse deleteReceiver(DeleteReceiverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteReceiverWithOptions(request, runtime);
    }

    public DeleteReceiverDetailResponse deleteReceiverDetailWithOptions(DeleteReceiverDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteReceiverDetail", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteReceiverDetailResponse());
    }

    public DeleteReceiverDetailResponse deleteReceiverDetail(DeleteReceiverDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteReceiverDetailWithOptions(request, runtime);
    }

    public DeleteSignResponse deleteSignWithOptions(DeleteSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSign", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSignResponse());
    }

    public DeleteSignResponse deleteSign(DeleteSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSignWithOptions(request, runtime);
    }

    public DeleteTagResponse deleteTagWithOptions(DeleteTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTag", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTagResponse());
    }

    public DeleteTagResponse deleteTag(DeleteTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTagWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplate", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public DescAccountSummaryResponse descAccountSummaryWithOptions(DescAccountSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescAccountSummary", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DescAccountSummaryResponse());
    }

    public DescAccountSummaryResponse descAccountSummary(DescAccountSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.descAccountSummaryWithOptions(request, runtime);
    }

    public DescAccountSummary2Response descAccountSummary2WithOptions(DescAccountSummary2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescAccountSummary2", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DescAccountSummary2Response());
    }

    public DescAccountSummary2Response descAccountSummary2(DescAccountSummary2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.descAccountSummary2WithOptions(request, runtime);
    }

    public DescDomainResponse descDomainWithOptions(DescDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescDomain", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DescDomainResponse());
    }

    public DescDomainResponse descDomain(DescDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.descDomainWithOptions(request, runtime);
    }

    public DescTemplateResponse descTemplateWithOptions(DescTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescTemplate", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new DescTemplateResponse());
    }

    public DescTemplateResponse descTemplate(DescTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.descTemplateWithOptions(request, runtime);
    }

    public EnableAccountResponse enableAccountWithOptions(EnableAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableAccount", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new EnableAccountResponse());
    }

    public EnableAccountResponse enableAccount(EnableAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableAccountWithOptions(request, runtime);
    }

    public GetAccountListResponse getAccountListWithOptions(GetAccountListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAccountList", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetAccountListResponse());
    }

    public GetAccountListResponse getAccountList(GetAccountListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountListWithOptions(request, runtime);
    }

    public GetIpfilterListResponse getIpfilterListWithOptions(GetIpfilterListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIpfilterList", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetIpfilterListResponse());
    }

    public GetIpfilterListResponse getIpfilterList(GetIpfilterListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpfilterListWithOptions(request, runtime);
    }

    public GetIpProtectionResponse getIpProtectionWithOptions(GetIpProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIpProtection", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetIpProtectionResponse());
    }

    public GetIpProtectionResponse getIpProtection(GetIpProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpProtectionWithOptions(request, runtime);
    }

    public GetMailAddressMsgCallBackUrlResponse getMailAddressMsgCallBackUrlWithOptions(GetMailAddressMsgCallBackUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMailAddressMsgCallBackUrl", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetMailAddressMsgCallBackUrlResponse());
    }

    public GetMailAddressMsgCallBackUrlResponse getMailAddressMsgCallBackUrl(GetMailAddressMsgCallBackUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMailAddressMsgCallBackUrlWithOptions(request, runtime);
    }

    public GetRegionListResponse getRegionListWithOptions(GetRegionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRegionList", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetRegionListResponse());
    }

    public GetRegionListResponse getRegionList(GetRegionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRegionListWithOptions(request, runtime);
    }

    public GetSenderAddressListResponse getSenderAddressListWithOptions(GetSenderAddressListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSenderAddressList", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetSenderAddressListResponse());
    }

    public GetSenderAddressListResponse getSenderAddressList(GetSenderAddressListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSenderAddressListWithOptions(request, runtime);
    }

    public GetTrackListResponse getTrackListWithOptions(GetTrackListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTrackList", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetTrackListResponse());
    }

    public GetTrackListResponse getTrackList(GetTrackListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTrackListWithOptions(request, runtime);
    }

    public GetTrackListByMailFromAndTagNameResponse getTrackListByMailFromAndTagNameWithOptions(GetTrackListByMailFromAndTagNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTrackListByMailFromAndTagName", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetTrackListByMailFromAndTagNameResponse());
    }

    public GetTrackListByMailFromAndTagNameResponse getTrackListByMailFromAndTagName(GetTrackListByMailFromAndTagNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTrackListByMailFromAndTagNameWithOptions(request, runtime);
    }

    public MigrateMarketResponse migrateMarketWithOptions(MigrateMarketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateMarket", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateMarketResponse());
    }

    public MigrateMarketResponse migrateMarket(MigrateMarketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateMarketWithOptions(request, runtime);
    }

    public ModifyAccountNotificationResponse modifyAccountNotificationWithOptions(ModifyAccountNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountNotification", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountNotificationResponse());
    }

    public ModifyAccountNotificationResponse modifyAccountNotification(ModifyAccountNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountNotificationWithOptions(request, runtime);
    }

    public ModifyMailAddressResponse modifyMailAddressWithOptions(ModifyMailAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMailAddress", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMailAddressResponse());
    }

    public ModifyMailAddressResponse modifyMailAddress(ModifyMailAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMailAddressWithOptions(request, runtime);
    }

    public ModifyPWByDomainResponse modifyPWByDomainWithOptions(ModifyPWByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPWByDomain", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPWByDomainResponse());
    }

    public ModifyPWByDomainResponse modifyPWByDomain(ModifyPWByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPWByDomainWithOptions(request, runtime);
    }

    public ModifySenderAddressNotificationResponse modifySenderAddressNotificationWithOptions(ModifySenderAddressNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySenderAddressNotification", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySenderAddressNotificationResponse());
    }

    public ModifySenderAddressNotificationResponse modifySenderAddressNotification(ModifySenderAddressNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySenderAddressNotificationWithOptions(request, runtime);
    }

    public ModifyTagResponse modifyTagWithOptions(ModifyTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTag", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTagResponse());
    }

    public ModifyTagResponse modifyTag(ModifyTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTagWithOptions(request, runtime);
    }

    public ModifyTemplateResponse modifyTemplateWithOptions(ModifyTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTemplate", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTemplateResponse());
    }

    public ModifyTemplateResponse modifyTemplate(ModifyTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTemplateWithOptions(request, runtime);
    }

    public QueryDomainByParamResponse queryDomainByParamWithOptions(QueryDomainByParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDomainByParam", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDomainByParamResponse());
    }

    public QueryDomainByParamResponse queryDomainByParam(QueryDomainByParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainByParamWithOptions(request, runtime);
    }

    public QueryInvalidAddressResponse queryInvalidAddressWithOptions(QueryInvalidAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInvalidAddress", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QueryInvalidAddressResponse());
    }

    public QueryInvalidAddressResponse queryInvalidAddress(QueryInvalidAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInvalidAddressWithOptions(request, runtime);
    }

    public QueryReceiverByParamResponse queryReceiverByParamWithOptions(QueryReceiverByParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryReceiverByParam", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QueryReceiverByParamResponse());
    }

    public QueryReceiverByParamResponse queryReceiverByParam(QueryReceiverByParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryReceiverByParamWithOptions(request, runtime);
    }

    public QueryReceiverDetailResponse queryReceiverDetailWithOptions(QueryReceiverDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryReceiverDetail", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QueryReceiverDetailResponse());
    }

    public QueryReceiverDetailResponse queryReceiverDetail(QueryReceiverDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryReceiverDetailWithOptions(request, runtime);
    }

    public QuerySignByParamResponse querySignByParamWithOptions(QuerySignByParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySignByParam", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySignByParamResponse());
    }

    public QuerySignByParamResponse querySignByParam(QuerySignByParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySignByParamWithOptions(request, runtime);
    }

    public QuerySmsStatisticsResponse querySmsStatisticsWithOptions(QuerySmsStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySmsStatistics", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySmsStatisticsResponse());
    }

    public QuerySmsStatisticsResponse querySmsStatistics(QuerySmsStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySmsStatisticsWithOptions(request, runtime);
    }

    public QueryTagByParamResponse queryTagByParamWithOptions(QueryTagByParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTagByParam", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTagByParamResponse());
    }

    public QueryTagByParamResponse queryTagByParam(QueryTagByParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTagByParamWithOptions(request, runtime);
    }

    public QueryTaskByParamResponse queryTaskByParamWithOptions(QueryTaskByParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskByParam", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskByParamResponse());
    }

    public QueryTaskByParamResponse queryTaskByParam(QueryTaskByParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskByParamWithOptions(request, runtime);
    }

    public QueryTemplateByParamResponse queryTemplateByParamWithOptions(QueryTemplateByParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTemplateByParam", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTemplateByParamResponse());
    }

    public QueryTemplateByParamResponse queryTemplateByParam(QueryTemplateByParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTemplateByParamWithOptions(request, runtime);
    }

    public SaveReceiverDetailResponse saveReceiverDetailWithOptions(SaveReceiverDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveReceiverDetail", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new SaveReceiverDetailResponse());
    }

    public SaveReceiverDetailResponse saveReceiverDetail(SaveReceiverDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveReceiverDetailWithOptions(request, runtime);
    }

    public SenderStatisticsByTagNameAndBatchIDResponse senderStatisticsByTagNameAndBatchIDWithOptions(SenderStatisticsByTagNameAndBatchIDRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SenderStatisticsByTagNameAndBatchID", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new SenderStatisticsByTagNameAndBatchIDResponse());
    }

    public SenderStatisticsByTagNameAndBatchIDResponse senderStatisticsByTagNameAndBatchID(SenderStatisticsByTagNameAndBatchIDRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.senderStatisticsByTagNameAndBatchIDWithOptions(request, runtime);
    }

    public SenderStatisticsDetailByParamResponse senderStatisticsDetailByParamWithOptions(SenderStatisticsDetailByParamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SenderStatisticsDetailByParam", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new SenderStatisticsDetailByParamResponse());
    }

    public SenderStatisticsDetailByParamResponse senderStatisticsDetailByParam(SenderStatisticsDetailByParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.senderStatisticsDetailByParamWithOptions(request, runtime);
    }

    public SendTestByTemplateResponse sendTestByTemplateWithOptions(SendTestByTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendTestByTemplate", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new SendTestByTemplateResponse());
    }

    public SendTestByTemplateResponse sendTestByTemplate(SendTestByTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendTestByTemplateWithOptions(request, runtime);
    }

    public SingleSendMailResponse singleSendMailWithOptions(SingleSendMailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SingleSendMail", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new SingleSendMailResponse());
    }

    public SingleSendMailResponse singleSendMail(SingleSendMailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.singleSendMailWithOptions(request, runtime);
    }

    public SingleSendSmsResponse singleSendSmsWithOptions(SingleSendSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SingleSendSms", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new SingleSendSmsResponse());
    }

    public SingleSendSmsResponse singleSendSms(SingleSendSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.singleSendSmsWithOptions(request, runtime);
    }

    public UpdateDomainTrackNameResponse updateDomainTrackNameWithOptions(UpdateDomainTrackNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDomainTrackName", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDomainTrackNameResponse());
    }

    public UpdateDomainTrackNameResponse updateDomainTrackName(UpdateDomainTrackNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainTrackNameWithOptions(request, runtime);
    }

    public UpdateIpProtectionResponse updateIpProtectionWithOptions(UpdateIpProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIpProtection", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIpProtectionResponse());
    }

    public UpdateIpProtectionResponse updateIpProtection(UpdateIpProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpProtectionWithOptions(request, runtime);
    }

    public UpdateMailAddressMsgCallBackUrlResponse updateMailAddressMsgCallBackUrlWithOptions(UpdateMailAddressMsgCallBackUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMailAddressMsgCallBackUrl", "2015-11-23", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMailAddressMsgCallBackUrlResponse());
    }

    public UpdateMailAddressMsgCallBackUrlResponse updateMailAddressMsgCallBackUrl(UpdateMailAddressMsgCallBackUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMailAddressMsgCallBackUrlWithOptions(request, runtime);
    }
}
