// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>consortium-lianmenyumingyi-hc5d1bwl****</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    @NameInMap("Tag")
    public java.util.List<DescribeConsortiumsRequestTag> tag;

    public static DescribeConsortiumsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumsRequest self = new DescribeConsortiumsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumsRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeConsortiumsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeConsortiumsRequest setTag(java.util.List<DescribeConsortiumsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeConsortiumsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeConsortiumsRequestTag extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeConsortiumsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumsRequestTag self = new DescribeConsortiumsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeConsortiumsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
