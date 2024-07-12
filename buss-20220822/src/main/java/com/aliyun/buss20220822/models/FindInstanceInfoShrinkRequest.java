// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class FindInstanceInfoShrinkRequest extends TeaModel {
    @NameInMap("bussinessCode")
    public String bussinessCode;

    @NameInMap("domain")
    public String domain;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("extras")
    public String extrasShrink;

    @NameInMap("ip")
    public String ip;

    @NameInMap("needDNS")
    public Boolean needDNS;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("url")
    public String url;

    @NameInMap("userId")
    public String userId;

    public static FindInstanceInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FindInstanceInfoShrinkRequest self = new FindInstanceInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FindInstanceInfoShrinkRequest setBussinessCode(String bussinessCode) {
        this.bussinessCode = bussinessCode;
        return this;
    }
    public String getBussinessCode() {
        return this.bussinessCode;
    }

    public FindInstanceInfoShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public FindInstanceInfoShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public FindInstanceInfoShrinkRequest setExtrasShrink(String extrasShrink) {
        this.extrasShrink = extrasShrink;
        return this;
    }
    public String getExtrasShrink() {
        return this.extrasShrink;
    }

    public FindInstanceInfoShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public FindInstanceInfoShrinkRequest setNeedDNS(Boolean needDNS) {
        this.needDNS = needDNS;
        return this;
    }
    public Boolean getNeedDNS() {
        return this.needDNS;
    }

    public FindInstanceInfoShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public FindInstanceInfoShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public FindInstanceInfoShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
