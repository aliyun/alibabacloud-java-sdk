// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ShowQuickAnalysisResponseBody extends TeaModel {
    /**
     * <p>The index fields.</p>
     */
    @NameInMap("Data")
    public ShowQuickAnalysisResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ShowQuickAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShowQuickAnalysisResponseBody self = new ShowQuickAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public ShowQuickAnalysisResponseBody setData(ShowQuickAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ShowQuickAnalysisResponseBodyData getData() {
        return this.data;
    }

    public ShowQuickAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ShowQuickAnalysisResponseBodyData extends TeaModel {
        /**
         * <p>The index fields of the logs.</p>
         */
        @NameInMap("IndexList")
        public java.util.List<String> indexList;

        public static ShowQuickAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ShowQuickAnalysisResponseBodyData self = new ShowQuickAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ShowQuickAnalysisResponseBodyData setIndexList(java.util.List<String> indexList) {
            this.indexList = indexList;
            return this;
        }
        public java.util.List<String> getIndexList() {
            return this.indexList;
        }

    }

}
