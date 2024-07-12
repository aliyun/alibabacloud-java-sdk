// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class FindInstanceInfoRequest extends TeaModel {
    @NameInMap("bussinessCode")
    public String bussinessCode;

    @NameInMap("domain")
    public String domain;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("extras")
    public java.util.Map<String, ?> extras;

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

    public static FindInstanceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        FindInstanceInfoRequest self = new FindInstanceInfoRequest();
        return TeaModel.build(map, self);
    }

    public FindInstanceInfoRequest setBussinessCode(String bussinessCode) {
        this.bussinessCode = bussinessCode;
        return this;
    }
    public String getBussinessCode() {
        return this.bussinessCode;
    }

    public FindInstanceInfoRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public FindInstanceInfoRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public FindInstanceInfoRequest setExtras(java.util.Map<String, ?> extras) {
        this.extras = extras;
        return this;
    }
    public java.util.Map<String, ?> getExtras() {
        return this.extras;
    }

    public FindInstanceInfoRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public FindInstanceInfoRequest setNeedDNS(Boolean needDNS) {
        this.needDNS = needDNS;
        return this;
    }
    public Boolean getNeedDNS() {
        return this.needDNS;
    }

    public FindInstanceInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public FindInstanceInfoRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public FindInstanceInfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
