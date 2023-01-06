// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUserBasicInfosRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    @NameInMap("Tag")
    public java.util.List<ListUserBasicInfosRequestTag> tag;

    public static ListUserBasicInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserBasicInfosRequest self = new ListUserBasicInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListUserBasicInfosRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUserBasicInfosRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListUserBasicInfosRequest setTag(java.util.List<ListUserBasicInfosRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListUserBasicInfosRequestTag> getTag() {
        return this.tag;
    }

    public static class ListUserBasicInfosRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListUserBasicInfosRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosRequestTag self = new ListUserBasicInfosRequestTag();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListUserBasicInfosRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
