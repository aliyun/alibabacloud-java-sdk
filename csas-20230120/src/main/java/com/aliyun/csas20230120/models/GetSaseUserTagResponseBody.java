// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetSaseUserTagResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2CABFEBB-0CE7-575E-833A-266F75D46713</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user tag response body.</p>
     */
    @NameInMap("SaseUserTag")
    public GetSaseUserTagResponseBodySaseUserTag saseUserTag;

    public static GetSaseUserTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSaseUserTagResponseBody self = new GetSaseUserTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSaseUserTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSaseUserTagResponseBody setSaseUserTag(GetSaseUserTagResponseBodySaseUserTag saseUserTag) {
        this.saseUserTag = saseUserTag;
        return this;
    }
    public GetSaseUserTagResponseBodySaseUserTag getSaseUserTag() {
        return this.saseUserTag;
    }

    public static class GetSaseUserTagResponseBodySaseUserTag extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>141681795035****</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The user tag description.</p>
         * 
         * <strong>example:</strong>
         * <p>These are the company\&quot;s employees</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>boss</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su-tag-1ae52f66039fa0d4****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        public static GetSaseUserTagResponseBodySaseUserTag build(java.util.Map<String, ?> map) throws Exception {
            GetSaseUserTagResponseBodySaseUserTag self = new GetSaseUserTagResponseBodySaseUserTag();
            return TeaModel.build(map, self);
        }

        public GetSaseUserTagResponseBodySaseUserTag setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public GetSaseUserTagResponseBodySaseUserTag setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSaseUserTagResponseBodySaseUserTag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSaseUserTagResponseBodySaseUserTag setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
