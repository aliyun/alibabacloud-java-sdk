// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupportModelsResponseBody extends TeaModel {
    @NameInMap("ModelNames")
    public ListSupportModelsResponseBodyModelNames modelNames;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSupportModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupportModelsResponseBody self = new ListSupportModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupportModelsResponseBody setModelNames(ListSupportModelsResponseBodyModelNames modelNames) {
        this.modelNames = modelNames;
        return this;
    }
    public ListSupportModelsResponseBodyModelNames getModelNames() {
        return this.modelNames;
    }

    public ListSupportModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSupportModelsResponseBodyModelNames extends TeaModel {
        @NameInMap("modelNames")
        public java.util.List<String> modelNames;

        public static ListSupportModelsResponseBodyModelNames build(java.util.Map<String, ?> map) throws Exception {
            ListSupportModelsResponseBodyModelNames self = new ListSupportModelsResponseBodyModelNames();
            return TeaModel.build(map, self);
        }

        public ListSupportModelsResponseBodyModelNames setModelNames(java.util.List<String> modelNames) {
            this.modelNames = modelNames;
            return this;
        }
        public java.util.List<String> getModelNames() {
            return this.modelNames;
        }

    }

}
