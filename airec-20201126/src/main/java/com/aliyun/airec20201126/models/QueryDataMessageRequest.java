// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QueryDataMessageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>expose</p>
     */
    @NameInMap("bhvType")
    public String bhvType;

    /**
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("cmdType")
    public String cmdType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("imei")
    public String imei;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("itemId")
    public String itemId;

    /**
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <strong>example:</strong>
     * <p>CONSOLE</p>
     */
    @NameInMap("messageSource")
    public String messageSource;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("traceId")
    public String traceId;

    /**
     * <strong>example:</strong>
     * <p>222</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("userType")
    public String userType;

    public static QueryDataMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataMessageRequest self = new QueryDataMessageRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataMessageRequest setBhvType(String bhvType) {
        this.bhvType = bhvType;
        return this;
    }
    public String getBhvType() {
        return this.bhvType;
    }

    public QueryDataMessageRequest setCmdType(String cmdType) {
        this.cmdType = cmdType;
        return this;
    }
    public String getCmdType() {
        return this.cmdType;
    }

    public QueryDataMessageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDataMessageRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public QueryDataMessageRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryDataMessageRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public QueryDataMessageRequest setMessageSource(String messageSource) {
        this.messageSource = messageSource;
        return this;
    }
    public String getMessageSource() {
        return this.messageSource;
    }

    public QueryDataMessageRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDataMessageRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryDataMessageRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public QueryDataMessageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryDataMessageRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryDataMessageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDataMessageRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
