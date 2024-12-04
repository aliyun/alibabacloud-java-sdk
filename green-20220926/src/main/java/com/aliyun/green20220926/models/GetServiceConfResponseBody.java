// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetServiceConfResponseBody extends TeaModel {
    @NameInMap("Classify")
    public String classify;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("CustomServiceConf")
    public java.util.Map<String, ?> customServiceConf;

    /**
     * <strong>example:</strong>
     * <p>2023-01-17 12:29:56</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Option")
    public java.util.Map<String, ?> option;

    /**
     * <strong>example:</strong>
     * <p>6CF2815C-<strong><strong>-</strong></strong>-B52E-FF6E2****492</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>UID。</p>
     * 
     * <strong>example:</strong>
     * <p>17726*****370735</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static GetServiceConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConfResponseBody self = new GetServiceConfResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceConfResponseBody setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public GetServiceConfResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceConfResponseBody setCustomServiceConf(java.util.Map<String, ?> customServiceConf) {
        this.customServiceConf = customServiceConf;
        return this;
    }
    public java.util.Map<String, ?> getCustomServiceConf() {
        return this.customServiceConf;
    }

    public GetServiceConfResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetServiceConfResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetServiceConfResponseBody setOption(java.util.Map<String, ?> option) {
        this.option = option;
        return this;
    }
    public java.util.Map<String, ?> getOption() {
        return this.option;
    }

    public GetServiceConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceConfResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetServiceConfResponseBody setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetServiceConfResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetServiceConfResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
