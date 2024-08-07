// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceLogResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddDataSourceLogResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDataSourceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceLogResponseBody self = new AddDataSourceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDataSourceLogResponseBody setData(AddDataSourceLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDataSourceLogResponseBodyData getData() {
        return this.data;
    }

    public AddDataSourceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddDataSourceLogResponseBodyData extends TeaModel {
        /**
         * <p>The number of logs that are added. The value 1 indicates that the log is added, and a value less than or equal to 0 indicates that the log failed to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the log. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>ef33097c9d1fdb0b9c7e8c7ca320pkl1</p>
         */
        @NameInMap("LogInstanceId")
        public String logInstanceId;

        public static AddDataSourceLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDataSourceLogResponseBodyData self = new AddDataSourceLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDataSourceLogResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public AddDataSourceLogResponseBodyData setLogInstanceId(String logInstanceId) {
            this.logInstanceId = logInstanceId;
            return this;
        }
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

    }

}
