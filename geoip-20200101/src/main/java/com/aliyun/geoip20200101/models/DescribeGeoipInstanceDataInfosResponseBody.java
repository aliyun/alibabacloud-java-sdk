// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceDataInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DataInfos")
    public DescribeGeoipInstanceDataInfosResponseBodyDataInfos dataInfos;

    public static DescribeGeoipInstanceDataInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceDataInfosResponseBody self = new DescribeGeoipInstanceDataInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceDataInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGeoipInstanceDataInfosResponseBody setDataInfos(DescribeGeoipInstanceDataInfosResponseBodyDataInfos dataInfos) {
        this.dataInfos = dataInfos;
        return this;
    }
    public DescribeGeoipInstanceDataInfosResponseBodyDataInfos getDataInfos() {
        return this.dataInfos;
    }

    public static class DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Version")
        public String version;

        @NameInMap("DownloadCount")
        public Long downloadCount;

        public static DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo self = new DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

    }

    public static class DescribeGeoipInstanceDataInfosResponseBodyDataInfos extends TeaModel {
        @NameInMap("DataInfo")
        public java.util.List<DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo> dataInfo;

        public static DescribeGeoipInstanceDataInfosResponseBodyDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeoipInstanceDataInfosResponseBodyDataInfos self = new DescribeGeoipInstanceDataInfosResponseBodyDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeGeoipInstanceDataInfosResponseBodyDataInfos setDataInfo(java.util.List<DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo> dataInfo) {
            this.dataInfo = dataInfo;
            return this;
        }
        public java.util.List<DescribeGeoipInstanceDataInfosResponseBodyDataInfosDataInfo> getDataInfo() {
            return this.dataInfo;
        }

    }

}
