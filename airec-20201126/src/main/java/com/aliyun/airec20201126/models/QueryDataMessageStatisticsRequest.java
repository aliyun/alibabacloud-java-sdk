// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QueryDataMessageStatisticsRequest extends TeaModel {
    /**
     * <p>The type of behaviors. Valid values: expose, click, like, comment, collect, stay, cart, buy, and evaluate.</p>
     * 
     * <strong>example:</strong>
     * <p>expose</p>
     */
    @NameInMap("bhvType")
    public String bhvType;

    /**
     * <p>The type of the operation. Valid values: update, delete, and add.</p>
     * 
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("cmdType")
    public String cmdType;

    /**
     * <p>The end time. The value is a timestamp in seconds.</p>
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
     * <p>The ID of the item. This parameter is required when the value of table is set to item.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("itemId")
    public String itemId;

    /**
     * <p>The type of the item. This parameter is required when the value of table is set to item.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The source of the operation. Valid values:</p>
     * <p>CONSOLE and FEEDER.</p>
     * 
     * <strong>example:</strong>
     * <p>FEEDER</p>
     */
    @NameInMap("messageSource")
    public String messageSource;

    /**
     * <p>The scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    /**
     * <p>The start time. The value is a timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The event tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("traceId")
    public String traceId;

    /**
     * <p>The ID of the user. This parameter is required when the value of table is set to user.</p>
     * 
     * <strong>example:</strong>
     * <p>222</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The type of the user. This parameter is required when the value of table is set to user.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("userType")
    public String userType;

    public static QueryDataMessageStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataMessageStatisticsRequest self = new QueryDataMessageStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataMessageStatisticsRequest setBhvType(String bhvType) {
        this.bhvType = bhvType;
        return this;
    }
    public String getBhvType() {
        return this.bhvType;
    }

    public QueryDataMessageStatisticsRequest setCmdType(String cmdType) {
        this.cmdType = cmdType;
        return this;
    }
    public String getCmdType() {
        return this.cmdType;
    }

    public QueryDataMessageStatisticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDataMessageStatisticsRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public QueryDataMessageStatisticsRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryDataMessageStatisticsRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public QueryDataMessageStatisticsRequest setMessageSource(String messageSource) {
        this.messageSource = messageSource;
        return this;
    }
    public String getMessageSource() {
        return this.messageSource;
    }

    public QueryDataMessageStatisticsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryDataMessageStatisticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryDataMessageStatisticsRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryDataMessageStatisticsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDataMessageStatisticsRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
