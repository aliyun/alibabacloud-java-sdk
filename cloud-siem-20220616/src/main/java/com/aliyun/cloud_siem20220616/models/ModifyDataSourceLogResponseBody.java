// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDataSourceLogResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDataSourceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceLogResponseBody self = new ModifyDataSourceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceLogResponseBody setData(ModifyDataSourceLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDataSourceLogResponseBodyData getData() {
        return this.data;
    }

    public ModifyDataSourceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDataSourceLogResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("LogInstanceId")
        public String logInstanceId;

        public static ModifyDataSourceLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceLogResponseBodyData self = new ModifyDataSourceLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceLogResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ModifyDataSourceLogResponseBodyData setLogInstanceId(String logInstanceId) {
            this.logInstanceId = logInstanceId;
            return this;
        }
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

    }

}
