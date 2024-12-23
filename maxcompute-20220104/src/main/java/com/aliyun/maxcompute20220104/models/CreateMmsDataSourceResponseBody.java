// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsDataSourceResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateMmsDataSourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>B42CA730-8187-50F1-9FE0-6733297036DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMmsDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsDataSourceResponseBody self = new CreateMmsDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMmsDataSourceResponseBody setData(CreateMmsDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMmsDataSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateMmsDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMmsDataSourceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("dataSourceId")
        public Long dataSourceId;

        public static CreateMmsDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMmsDataSourceResponseBodyData self = new CreateMmsDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMmsDataSourceResponseBodyData setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

    }

}
