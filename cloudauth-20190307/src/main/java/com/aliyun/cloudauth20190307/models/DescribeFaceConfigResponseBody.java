// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public java.util.List<DescribeFaceConfigResponseBodyItems> items;

    public static DescribeFaceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceConfigResponseBody self = new DescribeFaceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaceConfigResponseBody setItems(java.util.List<DescribeFaceConfigResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeFaceConfigResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeFaceConfigResponseBodyItems extends TeaModel {
        @NameInMap("GmtUpdated")
        public Long gmtUpdated;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("BizType")
        public String bizType;

        public static DescribeFaceConfigResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceConfigResponseBodyItems self = new DescribeFaceConfigResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeFaceConfigResponseBodyItems setGmtUpdated(Long gmtUpdated) {
            this.gmtUpdated = gmtUpdated;
            return this;
        }
        public Long getGmtUpdated() {
            return this.gmtUpdated;
        }

        public DescribeFaceConfigResponseBodyItems setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeFaceConfigResponseBodyItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

}
