// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetOssCredentialRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("IsCdn")
    public Boolean isCdn;

    @NameInMap("Type")
    public String type;

    public static GetOssCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssCredentialRequest self = new GetOssCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetOssCredentialRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public GetOssCredentialRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public GetOssCredentialRequest setIsCdn(Boolean isCdn) {
        this.isCdn = isCdn;
        return this;
    }
    public Boolean getIsCdn() {
        return this.isCdn;
    }

    public GetOssCredentialRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
