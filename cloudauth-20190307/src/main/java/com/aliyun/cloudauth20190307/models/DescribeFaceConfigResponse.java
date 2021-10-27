// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<DescribeFaceConfigResponseItems> items;

    public static DescribeFaceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceConfigResponse self = new DescribeFaceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaceConfigResponse setItems(java.util.List<DescribeFaceConfigResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeFaceConfigResponseItems> getItems() {
        return this.items;
    }

    public static class DescribeFaceConfigResponseItems extends TeaModel {
        @NameInMap("BizName")
        @Validation(required = true)
        public String bizName;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("GmtUpdated")
        @Validation(required = true)
        public Long gmtUpdated;

        public static DescribeFaceConfigResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceConfigResponseItems self = new DescribeFaceConfigResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeFaceConfigResponseItems setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeFaceConfigResponseItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeFaceConfigResponseItems setGmtUpdated(Long gmtUpdated) {
            this.gmtUpdated = gmtUpdated;
            return this;
        }
        public Long getGmtUpdated() {
            return this.gmtUpdated;
        }

    }

}
