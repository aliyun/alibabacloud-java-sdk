// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BuyPayAsYouGoOrderRequest extends TeaModel {
    /**
     * <p>The type of the resource that you want to purchase.</p>
     * <br>
     * <p>*   **VersionType**: DMS that supports control modes</p>
     * <p>*   **SensitiveDataProtection**: DMS that supports sensitive data protection</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityType")
    public String commodityType;

    /**
     * <p>The number of database instances that you want to use DMS to manage.</p>
     * <br>
     * <p>> A quota can be used for only one database instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InsNum")
    public Integer insNum;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The control mode of DMS. Valid values:</p>
     * <br>
     * <p>*   **stand**: Stable Change</p>
     * <p>*   **safety**: Security Collaboration</p>
     */
    @NameInMap("VersionType")
    public String versionType;

    public static BuyPayAsYouGoOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        BuyPayAsYouGoOrderRequest self = new BuyPayAsYouGoOrderRequest();
        return TeaModel.build(map, self);
    }

    public BuyPayAsYouGoOrderRequest setCommodityType(String commodityType) {
        this.commodityType = commodityType;
        return this;
    }
    public String getCommodityType() {
        return this.commodityType;
    }

    public BuyPayAsYouGoOrderRequest setInsNum(Integer insNum) {
        this.insNum = insNum;
        return this;
    }
    public Integer getInsNum() {
        return this.insNum;
    }

    public BuyPayAsYouGoOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public BuyPayAsYouGoOrderRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
