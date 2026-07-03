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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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
         * <p>The number of modified logs. A value of 1 indicates success. A value of 0 or less indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the log. The threat analysis feature generates this ID by calculating an MD5 hash of the parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
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
