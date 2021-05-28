// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListServerlessTopNAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListServerlessTopNAppsResponseBodyData> data;

    public static ListServerlessTopNAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerlessTopNAppsResponseBody self = new ListServerlessTopNAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerlessTopNAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerlessTopNAppsResponseBody setData(java.util.List<ListServerlessTopNAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServerlessTopNAppsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListServerlessTopNAppsResponseBodyData extends TeaModel {
        @NameInMap("Pid")
        public String pid;

        @NameInMap("Region")
        public String region;

        @NameInMap("Rt")
        public Float rt;

        @NameInMap("Error")
        public Integer error;

        @NameInMap("Name")
        public String name;

        @NameInMap("Count")
        public Integer count;

        public static ListServerlessTopNAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServerlessTopNAppsResponseBodyData self = new ListServerlessTopNAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServerlessTopNAppsResponseBodyData setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public ListServerlessTopNAppsResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListServerlessTopNAppsResponseBodyData setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public ListServerlessTopNAppsResponseBodyData setError(Integer error) {
            this.error = error;
            return this;
        }
        public Integer getError() {
            return this.error;
        }

        public ListServerlessTopNAppsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServerlessTopNAppsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
