// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class AuditItemSubmitRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.List<AuditItemSubmitRequestData> data;

    public static AuditItemSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditItemSubmitRequest self = new AuditItemSubmitRequest();
        return TeaModel.build(map, self);
    }

    public AuditItemSubmitRequest setData(java.util.List<AuditItemSubmitRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AuditItemSubmitRequestData> getData() {
        return this.data;
    }

    public static class AuditItemSubmitRequestData extends TeaModel {
        @NameInMap("CustomResult")
        public String customResult;

        @NameInMap("CustomRiskType")
        public String customRiskType;

        @NameInMap("Id")
        public Long id;

        public static AuditItemSubmitRequestData build(java.util.Map<String, ?> map) throws Exception {
            AuditItemSubmitRequestData self = new AuditItemSubmitRequestData();
            return TeaModel.build(map, self);
        }

        public AuditItemSubmitRequestData setCustomResult(String customResult) {
            this.customResult = customResult;
            return this;
        }
        public String getCustomResult() {
            return this.customResult;
        }

        public AuditItemSubmitRequestData setCustomRiskType(String customRiskType) {
            this.customRiskType = customRiskType;
            return this;
        }
        public String getCustomRiskType() {
            return this.customRiskType;
        }

        public AuditItemSubmitRequestData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
