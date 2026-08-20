// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedTagResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1D3BCF94-7F83-559E-82D9-C891BBB32FC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The prohibited software tag.</p>
     */
    @NameInMap("Tag")
    public UpdateProhibitedTagResponseBodyTag tag;

    public static UpdateProhibitedTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedTagResponseBody self = new UpdateProhibitedTagResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProhibitedTagResponseBody setTag(UpdateProhibitedTagResponseBodyTag tag) {
        this.tag = tag;
        return this;
    }
    public UpdateProhibitedTagResponseBodyTag getTag() {
        return this.tag;
    }

    public static class UpdateProhibitedTagResponseBodyTag extends TeaModel {
        /**
         * <p>The creation time of the prohibited software tag, in the yyyy-MM-dd HH:mm:ss format. The time is displayed in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-05 10:20:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the prohibited software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test constraints</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the prohibited software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>PolicyC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the prohibited software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-d730092d87ec****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        public static UpdateProhibitedTagResponseBodyTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedTagResponseBodyTag self = new UpdateProhibitedTagResponseBodyTag();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedTagResponseBodyTag setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateProhibitedTagResponseBodyTag setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProhibitedTagResponseBodyTag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProhibitedTagResponseBodyTag setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
