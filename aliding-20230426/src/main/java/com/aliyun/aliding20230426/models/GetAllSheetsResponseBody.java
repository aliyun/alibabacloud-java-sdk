// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAllSheetsResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("value")
    public java.util.List<GetAllSheetsResponseBodyValue> value;

    public static GetAllSheetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllSheetsResponseBody self = new GetAllSheetsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllSheetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllSheetsResponseBody setValue(java.util.List<GetAllSheetsResponseBodyValue> value) {
        this.value = value;
        return this;
    }
    public java.util.List<GetAllSheetsResponseBodyValue> getValue() {
        return this.value;
    }

    public static class GetAllSheetsResponseBodyValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>stxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>Sheet1</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetAllSheetsResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            GetAllSheetsResponseBodyValue self = new GetAllSheetsResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public GetAllSheetsResponseBodyValue setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAllSheetsResponseBodyValue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
