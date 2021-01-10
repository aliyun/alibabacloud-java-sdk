// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListSupportFeaturesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportFeatures")
    public java.util.List<ListSupportFeaturesResponseBodySupportFeatures> supportFeatures;

    public static ListSupportFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupportFeaturesResponseBody self = new ListSupportFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupportFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupportFeaturesResponseBody setSupportFeatures(java.util.List<ListSupportFeaturesResponseBodySupportFeatures> supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }
    public java.util.List<ListSupportFeaturesResponseBodySupportFeatures> getSupportFeatures() {
        return this.supportFeatures;
    }

    public static class ListSupportFeaturesResponseBodySupportFeatures extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListSupportFeaturesResponseBodySupportFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListSupportFeaturesResponseBodySupportFeatures self = new ListSupportFeaturesResponseBodySupportFeatures();
            return TeaModel.build(map, self);
        }

        public ListSupportFeaturesResponseBodySupportFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
