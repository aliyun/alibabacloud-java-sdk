// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoQuickFieldRequest extends TeaModel {
    /**
     * <p>The time when the quick analysis starts. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("From")
    public Integer from;

    /**
     * <p>The index field.</p>
     */
    @NameInMap("Index")
    public String index;

    /**
     * <p>The number of pages to return. Default value: 1.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sorting of the query and analysis results. By default, the results are sorted in descending order.</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The time when the quick analysis ends. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("To")
    public Integer to;

    public static DoQuickFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DoQuickFieldRequest self = new DoQuickFieldRequest();
        return TeaModel.build(map, self);
    }

    public DoQuickFieldRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public DoQuickFieldRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public DoQuickFieldRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DoQuickFieldRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DoQuickFieldRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public DoQuickFieldRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public DoQuickFieldRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
