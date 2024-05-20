// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class InsertCustomRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiId")
    public Integer apiId;

    @NameInMap("CustomFileName")
    public String customFileName;

    @NameInMap("CustomUrl")
    public String customUrl;

    @NameInMap("RegFileName")
    public String regFileName;

    @NameInMap("RegUrl")
    public String regUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static InsertCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertCustomRequest self = new InsertCustomRequest();
        return TeaModel.build(map, self);
    }

    public InsertCustomRequest setApiId(Integer apiId) {
        this.apiId = apiId;
        return this;
    }
    public Integer getApiId() {
        return this.apiId;
    }

    public InsertCustomRequest setCustomFileName(String customFileName) {
        this.customFileName = customFileName;
        return this;
    }
    public String getCustomFileName() {
        return this.customFileName;
    }

    public InsertCustomRequest setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
        return this;
    }
    public String getCustomUrl() {
        return this.customUrl;
    }

    public InsertCustomRequest setRegFileName(String regFileName) {
        this.regFileName = regFileName;
        return this;
    }
    public String getRegFileName() {
        return this.regFileName;
    }

    public InsertCustomRequest setRegUrl(String regUrl) {
        this.regUrl = regUrl;
        return this;
    }
    public String getRegUrl() {
        return this.regUrl;
    }

    public InsertCustomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
