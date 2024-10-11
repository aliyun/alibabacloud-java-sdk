// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RecommendRequest extends TeaModel {
    /**
     * <p>The status of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJqb2luIjoiYW5kIiwiZmlsdGVycyI6W3siY29uZCI6ImNvbnRhaW4iLCJmaWVsZCI6InRhZ3MiLCJ2YWx1ZSI6IuWPjOS6uiJ9XX0.</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The ID of the scene in which the item is to be recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>06e1565409c9fc4887036b974421****</p>
     */
    @NameInMap("imei")
    public String imei;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1</p>
     */
    @NameInMap("ip")
    public String ip;

    /**
     * <p>The information about event tracking. The value of this parameter varies based on different items and needs to be uploaded together with the corresponding behavior data.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("items")
    public String items;

    /**
     * <p>N/A</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("rankOpen")
    public Boolean rankOpen;

    /**
     * <p>The type of the recommended item.</p>
     * 
     * <strong>example:</strong>
     * <p>gul</p>
     */
    @NameInMap("recType")
    public String recType;

    /**
     * <p>The returned results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("returnCount")
    public Integer returnCount;

    /**
     * <p>The number of result entries to return. Valid values: 0 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    /**
     * <p>The position at which the recommended item is displayed. The position number starts from 0. The return results are ranked by position. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>如果需要使用坑位策略，请求参数内新增strategy=&quot;fixedSlot&quot;，此时系统将按照坑位配置返回推荐结果</p>
     * 
     * <strong>example:</strong>
     * <p>fixedSlot</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
     * <p>The items used for related recommendations in specified scenes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userInfo")
    public String userInfo;

    public static RecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        RecommendRequest self = new RecommendRequest();
        return TeaModel.build(map, self);
    }

    public RecommendRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public RecommendRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public RecommendRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public RecommendRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public RecommendRequest setRankOpen(Boolean rankOpen) {
        this.rankOpen = rankOpen;
        return this;
    }
    public Boolean getRankOpen() {
        return this.rankOpen;
    }

    public RecommendRequest setRecType(String recType) {
        this.recType = recType;
        return this;
    }
    public String getRecType() {
        return this.recType;
    }

    public RecommendRequest setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
        return this;
    }
    public Integer getReturnCount() {
        return this.returnCount;
    }

    public RecommendRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public RecommendRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public RecommendRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public RecommendRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RecommendRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

}
