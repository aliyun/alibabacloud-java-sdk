// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoQuickFieldRequest extends TeaModel {
    @NameInMap("From")
    public Integer from;

    @NameInMap("Index")
    public String index;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Reverse")
    public Boolean reverse;

    @NameInMap("Size")
    public Integer size;

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
