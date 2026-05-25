// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogCollectListRequest extends TeaModel {
    /**
     * <p>appKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24780725</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Author")
    public String author;

    /**
     * <strong>example:</strong>
     * <p>1777996800000</p>
     */
    @NameInMap("BeginDate")
    public Long beginDate;

    /**
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>1777996800000</p>
     */
    @NameInMap("CreateBeginDate")
    public Long createBeginDate;

    /**
     * <strong>example:</strong>
     * <p>1777996800000</p>
     */
    @NameInMap("CreateEndDate")
    public Long createEndDate;

    /**
     * <strong>example:</strong>
     * <p>ad-0002nzx5r86f7jzrv0nx-91</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>1777996800000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <strong>example:</strong>
     * <p>user_nick</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>iphone</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OsVersion")
    public String osVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>positiveComment</p>
     */
    @NameInMap("PositiveComment")
    public String positiveComment;

    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>START</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1777996800000</p>
     */
    @NameInMap("UpdateBeginDate")
    public Long updateBeginDate;

    /**
     * <strong>example:</strong>
     * <p>1777996800000</p>
     */
    @NameInMap("UpdateEndDate")
    public Long updateEndDate;

    /**
     * <strong>example:</strong>
     * <p>user_nick</p>
     */
    @NameInMap("UserNick")
    public String userNick;

    /**
     * <strong>example:</strong>
     * <p>Z70g6V/MXJ8DABtD53eHzn4X</p>
     */
    @NameInMap("Utdid")
    public String utdid;

    public static GetTlogCollectListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTlogCollectListRequest self = new GetTlogCollectListRequest();
        return TeaModel.build(map, self);
    }

    public GetTlogCollectListRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetTlogCollectListRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetTlogCollectListRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public GetTlogCollectListRequest setBeginDate(Long beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public Long getBeginDate() {
        return this.beginDate;
    }

    public GetTlogCollectListRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public GetTlogCollectListRequest setCreateBeginDate(Long createBeginDate) {
        this.createBeginDate = createBeginDate;
        return this;
    }
    public Long getCreateBeginDate() {
        return this.createBeginDate;
    }

    public GetTlogCollectListRequest setCreateEndDate(Long createEndDate) {
        this.createEndDate = createEndDate;
        return this;
    }
    public Long getCreateEndDate() {
        return this.createEndDate;
    }

    public GetTlogCollectListRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetTlogCollectListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetTlogCollectListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetTlogCollectListRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetTlogCollectListRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetTlogCollectListRequest setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public GetTlogCollectListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetTlogCollectListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTlogCollectListRequest setPositiveComment(String positiveComment) {
        this.positiveComment = positiveComment;
        return this;
    }
    public String getPositiveComment() {
        return this.positiveComment;
    }

    public GetTlogCollectListRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetTlogCollectListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTlogCollectListRequest setUpdateBeginDate(Long updateBeginDate) {
        this.updateBeginDate = updateBeginDate;
        return this;
    }
    public Long getUpdateBeginDate() {
        return this.updateBeginDate;
    }

    public GetTlogCollectListRequest setUpdateEndDate(Long updateEndDate) {
        this.updateEndDate = updateEndDate;
        return this;
    }
    public Long getUpdateEndDate() {
        return this.updateEndDate;
    }

    public GetTlogCollectListRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public GetTlogCollectListRequest setUtdid(String utdid) {
        this.utdid = utdid;
        return this;
    }
    public String getUtdid() {
        return this.utdid;
    }

}
