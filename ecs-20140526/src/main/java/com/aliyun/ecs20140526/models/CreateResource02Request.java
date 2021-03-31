// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateResource02Request extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Filter")
    public java.util.List<CreateResource02RequestFilter> filter;

    public static CreateResource02Request build(java.util.Map<String, ?> map) throws Exception {
        CreateResource02Request self = new CreateResource02Request();
        return TeaModel.build(map, self);
    }

    public CreateResource02Request setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateResource02Request setFilter(java.util.List<CreateResource02RequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<CreateResource02RequestFilter> getFilter() {
        return this.filter;
    }

    public static class CreateResource02RequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateResource02RequestFilter build(java.util.Map<String, ?> map) throws Exception {
            CreateResource02RequestFilter self = new CreateResource02RequestFilter();
            return TeaModel.build(map, self);
        }

        public CreateResource02RequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResource02RequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
