// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AliyunConsoleServiceInfoDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/product/ai-algorithm">https://www.aliyun.com/product/ai-algorithm</a></p>
     */
    @NameInMap("buyUrl")
    public String buyUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/product/ai-algorithm">https://www.aliyun.com/product/ai-algorithm</a></p>
     */
    @NameInMap("documentUrl")
    public String documentUrl;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("freeConcurrencyCount")
    public Integer freeConcurrencyCount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("freeCount")
    public Integer freeCount;

    /**
     * <strong>example:</strong>
     * <p>online_ai_algorithm_personalized_text_to_image_call_count</p>
     */
    @NameInMap("serviceCode")
    public String serviceCode;

    /**
     * <strong>example:</strong>
     * <p>AI算法模型-个性化文生图-在线按量调用</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    public static AliyunConsoleServiceInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        AliyunConsoleServiceInfoDTO self = new AliyunConsoleServiceInfoDTO();
        return TeaModel.build(map, self);
    }

    public AliyunConsoleServiceInfoDTO setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
        return this;
    }
    public String getBuyUrl() {
        return this.buyUrl;
    }

    public AliyunConsoleServiceInfoDTO setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
        return this;
    }
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    public AliyunConsoleServiceInfoDTO setFreeConcurrencyCount(Integer freeConcurrencyCount) {
        this.freeConcurrencyCount = freeConcurrencyCount;
        return this;
    }
    public Integer getFreeConcurrencyCount() {
        return this.freeConcurrencyCount;
    }

    public AliyunConsoleServiceInfoDTO setFreeCount(Integer freeCount) {
        this.freeCount = freeCount;
        return this;
    }
    public Integer getFreeCount() {
        return this.freeCount;
    }

    public AliyunConsoleServiceInfoDTO setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public AliyunConsoleServiceInfoDTO setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
