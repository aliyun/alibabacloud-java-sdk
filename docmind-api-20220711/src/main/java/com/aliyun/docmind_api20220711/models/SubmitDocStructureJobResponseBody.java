// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocStructureJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitDocStructureJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDocStructureJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocStructureJobResponseBody self = new SubmitDocStructureJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocStructureJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitDocStructureJobResponseBody setData(SubmitDocStructureJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDocStructureJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitDocStructureJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitDocStructureJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDocStructureJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>docmind-20220816-15bc7965</p>
         */
        @NameInMap("Id")
        public String id;

        public static SubmitDocStructureJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocStructureJobResponseBodyData self = new SubmitDocStructureJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDocStructureJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
