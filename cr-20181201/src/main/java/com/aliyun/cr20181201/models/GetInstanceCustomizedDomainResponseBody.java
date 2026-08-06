// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceCustomizedDomainResponseBody extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24858802</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1571926439000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The custom domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>docker-images.qu-in.club</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The domain type.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The custom endpoint type.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-4ec5xvj4j0l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1638259914000</p>
     */
    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    /**
     * <p>The custom module name.</p>
     * 
     * <strong>example:</strong>
     * <p>Chart</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CE1F661-75DD-4EBD-A4AD-057B26834ABB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceCustomizedDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCustomizedDomainResponseBody self = new GetInstanceCustomizedDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceCustomizedDomainResponseBody setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public GetInstanceCustomizedDomainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceCustomizedDomainResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetInstanceCustomizedDomainResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetInstanceCustomizedDomainResponseBody setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public GetInstanceCustomizedDomainResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetInstanceCustomizedDomainResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceCustomizedDomainResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetInstanceCustomizedDomainResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetInstanceCustomizedDomainResponseBody setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public GetInstanceCustomizedDomainResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceCustomizedDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
