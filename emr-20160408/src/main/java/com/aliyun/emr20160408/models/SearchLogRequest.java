// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class SearchLogRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostInnerIp")
    public String hostInnerIp;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("FromTimestamp")
    public Integer fromTimestamp;

    @NameInMap("ToTimestamp")
    public Integer toTimestamp;

    @NameInMap("SlsQueryString")
    public String slsQueryString;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("Line")
    public Integer line;

    @NameInMap("Reverse")
    public Boolean reverse;

    public static SearchLogRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchLogRequest self = new SearchLogRequest();
        return TeaModel.build(map, self);
    }

    public SearchLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SearchLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchLogRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SearchLogRequest setHostInnerIp(String hostInnerIp) {
        this.hostInnerIp = hostInnerIp;
        return this;
    }
    public String getHostInnerIp() {
        return this.hostInnerIp;
    }

    public SearchLogRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SearchLogRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public SearchLogRequest setFromTimestamp(Integer fromTimestamp) {
        this.fromTimestamp = fromTimestamp;
        return this;
    }
    public Integer getFromTimestamp() {
        return this.fromTimestamp;
    }

    public SearchLogRequest setToTimestamp(Integer toTimestamp) {
        this.toTimestamp = toTimestamp;
        return this;
    }
    public Integer getToTimestamp() {
        return this.toTimestamp;
    }

    public SearchLogRequest setSlsQueryString(String slsQueryString) {
        this.slsQueryString = slsQueryString;
        return this;
    }
    public String getSlsQueryString() {
        return this.slsQueryString;
    }

    public SearchLogRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public SearchLogRequest setLine(Integer line) {
        this.line = line;
        return this;
    }
    public Integer getLine() {
        return this.line;
    }

    public SearchLogRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

}
