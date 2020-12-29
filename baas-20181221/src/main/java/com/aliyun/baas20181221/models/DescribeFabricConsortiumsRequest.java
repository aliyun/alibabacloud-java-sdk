// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumsRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("Location")
    public String location;

    @NameInMap("Tag")
    public java.util.List<DescribeFabricConsortiumsRequestTag> tag;

    public static DescribeFabricConsortiumsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumsRequest self = new DescribeFabricConsortiumsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumsRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeFabricConsortiumsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeFabricConsortiumsRequest setTag(java.util.List<DescribeFabricConsortiumsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeFabricConsortiumsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeFabricConsortiumsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumsRequestTag self = new DescribeFabricConsortiumsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFabricConsortiumsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
