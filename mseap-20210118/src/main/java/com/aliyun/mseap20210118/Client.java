// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118;

import com.aliyun.tea.*;
import com.aliyun.mseap20210118.models.*;
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
        this._endpoint = this.getEndpoint("mseap", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivateLicenseResponse activateLicenseWithOptions(ActivateLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivateLicense", "2021-01-18", "HTTPS", "POST", "AK", "json", req, runtime), new ActivateLicenseResponse());
    }

    public ActivateLicenseResponse activateLicense(ActivateLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateLicenseWithOptions(request, runtime);
    }

    public BusinessLicenseOcrResponse businessLicenseOcrWithOptions(BusinessLicenseOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BusinessLicenseOcr", "2021-01-18", "HTTPS", "POST", "AK", "json", req, runtime), new BusinessLicenseOcrResponse());
    }

    public BusinessLicenseOcrResponse businessLicenseOcr(BusinessLicenseOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.businessLicenseOcrWithOptions(request, runtime);
    }

    public CertificateQualityResponse certificateQualityWithOptions(CertificateQualityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CertificateQuality", "2021-01-18", "HTTPS", "POST", "AK", "json", req, runtime), new CertificateQualityResponse());
    }

    public CertificateQualityResponse certificateQuality(CertificateQualityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.certificateQualityWithOptions(request, runtime);
    }

    public DescribeAgreementStatusResponse describeAgreementStatusWithOptions(DescribeAgreementStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAgreementStatus", "2021-01-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAgreementStatusResponse());
    }

    public DescribeAgreementStatusResponse describeAgreementStatus(DescribeAgreementStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAgreementStatusWithOptions(request, runtime);
    }

    public IdentityCardOcrResponse identityCardOcrWithOptions(IdentityCardOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("IdentityCardOcr", "2021-01-18", "HTTPS", "POST", "AK", "json", req, runtime), new IdentityCardOcrResponse());
    }

    public IdentityCardOcrResponse identityCardOcr(IdentityCardOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.identityCardOcrWithOptions(request, runtime);
    }

    public UpdateAgreementStatusResponse updateAgreementStatusWithOptions(UpdateAgreementStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAgreementStatus", "2021-01-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAgreementStatusResponse());
    }

    public UpdateAgreementStatusResponse updateAgreementStatus(UpdateAgreementStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAgreementStatusWithOptions(request, runtime);
    }
}
