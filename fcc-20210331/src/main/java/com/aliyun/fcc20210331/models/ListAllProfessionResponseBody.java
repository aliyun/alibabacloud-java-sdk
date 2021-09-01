// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListAllProfessionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListAllProfessionResponseBodyData> data;

    public static ListAllProfessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllProfessionResponseBody self = new ListAllProfessionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllProfessionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAllProfessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllProfessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllProfessionResponseBody setData(java.util.List<ListAllProfessionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllProfessionResponseBodyData> getData() {
        return this.data;
    }

    public static class ListAllProfessionResponseBodyData extends TeaModel {
        @NameInMap("ProfessionName")
        public String professionName;

        @NameInMap("ProfessionId")
        public Integer professionId;

        public static ListAllProfessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllProfessionResponseBodyData self = new ListAllProfessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllProfessionResponseBodyData setProfessionName(String professionName) {
            this.professionName = professionName;
            return this;
        }
        public String getProfessionName() {
            return this.professionName;
        }

        public ListAllProfessionResponseBodyData setProfessionId(Integer professionId) {
            this.professionId = professionId;
            return this;
        }
        public Integer getProfessionId() {
            return this.professionId;
        }

    }

}
