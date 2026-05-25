// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogDeviceListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24781204</p>
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
     * <p>1778860800000</p>
     */
    @NameInMap("BeginDate")
    public Long beginDate;

    /**
     * <strong>example:</strong>
     * <p>apple</p>
     */
    @NameInMap("Brand")
    public String brand;

    @NameInMap("City")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>1633159200000</p>
     */
    @NameInMap("CreateBeginDate")
    public Long createBeginDate;

    /**
     * <strong>example:</strong>
     * <p>1633159200000</p>
     */
    @NameInMap("CreateEndDate")
    public Long createEndDate;

    /**
     * <strong>example:</strong>
     * <p>1779465599999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <strong>example:</strong>
     * <p>Z70g612312124323Hzn4X</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>iphone16</p>
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
     * <p>1.0</p>
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
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1633159200000</p>
     */
    @NameInMap("UpdateBeginDate")
    public Long updateBeginDate;

    /**
     * <strong>example:</strong>
     * <p>1633159200000</p>
     */
    @NameInMap("UpdateEndDate")
    public Long updateEndDate;

    /**
     * <strong>example:</strong>
     * <p>userNick</p>
     */
    @NameInMap("UserNick")
    public String userNick;

    /**
     * <strong>example:</strong>
     * <p>Z70g612312124323Hzn4X</p>
     */
    @NameInMap("Utdid")
    public String utdid;

    public static GetTlogDeviceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTlogDeviceListRequest self = new GetTlogDeviceListRequest();
        return TeaModel.build(map, self);
    }

    public GetTlogDeviceListRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetTlogDeviceListRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetTlogDeviceListRequest setBeginDate(Long beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public Long getBeginDate() {
        return this.beginDate;
    }

    public GetTlogDeviceListRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public GetTlogDeviceListRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public GetTlogDeviceListRequest setCreateBeginDate(Long createBeginDate) {
        this.createBeginDate = createBeginDate;
        return this;
    }
    public Long getCreateBeginDate() {
        return this.createBeginDate;
    }

    public GetTlogDeviceListRequest setCreateEndDate(Long createEndDate) {
        this.createEndDate = createEndDate;
        return this;
    }
    public Long getCreateEndDate() {
        return this.createEndDate;
    }

    public GetTlogDeviceListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetTlogDeviceListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetTlogDeviceListRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetTlogDeviceListRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetTlogDeviceListRequest setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public GetTlogDeviceListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetTlogDeviceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTlogDeviceListRequest setUpdateBeginDate(Long updateBeginDate) {
        this.updateBeginDate = updateBeginDate;
        return this;
    }
    public Long getUpdateBeginDate() {
        return this.updateBeginDate;
    }

    public GetTlogDeviceListRequest setUpdateEndDate(Long updateEndDate) {
        this.updateEndDate = updateEndDate;
        return this;
    }
    public Long getUpdateEndDate() {
        return this.updateEndDate;
    }

    public GetTlogDeviceListRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public GetTlogDeviceListRequest setUtdid(String utdid) {
        this.utdid = utdid;
        return this;
    }
    public String getUtdid() {
        return this.utdid;
    }

}
