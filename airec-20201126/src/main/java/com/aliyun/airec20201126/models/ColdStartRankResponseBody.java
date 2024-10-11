// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ColdStartRankResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ColdStartRankResponseBodyResult> result;

    public static ColdStartRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ColdStartRankResponseBody self = new ColdStartRankResponseBody();
        return TeaModel.build(map, self);
    }

    public ColdStartRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ColdStartRankResponseBody setResult(java.util.List<ColdStartRankResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ColdStartRankResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ColdStartRankResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3_Lwm4vy1</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>article</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <strong>example:</strong>
         * <p>1007.62364.131773.100200300000000:d709586e-643c-4fcb-a35c-6c5e8cd6756e:Grr8KG::0:sy_list_gul:::1:content___3_Lwm4vy:article:i2i_common_common:9.385107352002104E-4:0.25131988525390625:null:1677207034118::context__recall_index=253,context__hour=10,context__trigger_num=2::002bc90e-0d30-4682-9de3-1f4bad73702e:i2i_scategory_common,hot_common,i2i_common_common,i2i_swing_common:::::</p>
         */
        @NameInMap("traceInfo")
        public String traceInfo;

        public static ColdStartRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ColdStartRankResponseBodyResult self = new ColdStartRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ColdStartRankResponseBodyResult setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ColdStartRankResponseBodyResult setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ColdStartRankResponseBodyResult setTraceInfo(String traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public String getTraceInfo() {
            return this.traceInfo;
        }

    }

}
