// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceLogResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ModifyDataSourceLogResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The number of logs that are modified. The value 1 indicates that the modification is successful, and a value less than or equal to 0 indicates that the modification failed.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the log. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters.</p>
         */
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
