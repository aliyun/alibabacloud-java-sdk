// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateProhibitedTagResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C7F30ABA-67BD-537D-A516-8DA20DA1F28C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The disabled software tag.</p>
     */
    @NameInMap("Tag")
    public CreateProhibitedTagResponseBodyTag tag;

    public static CreateProhibitedTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProhibitedTagResponseBody self = new CreateProhibitedTagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProhibitedTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProhibitedTagResponseBody setTag(CreateProhibitedTagResponseBodyTag tag) {
        this.tag = tag;
        return this;
    }
    public CreateProhibitedTagResponseBodyTag getTag() {
        return this.tag;
    }

    public static class CreateProhibitedTagResponseBodyTag extends TeaModel {
        /**
         * <p>The time when the disabled software tag was created, in the yyyy-MM-dd HH:mm:ss format. The time is displayed in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-19 10:24:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the disabled software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test template create get delete</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the disabled software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_37bf6a18</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the disabled software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-4a4046838f77****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        public static CreateProhibitedTagResponseBodyTag build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedTagResponseBodyTag self = new CreateProhibitedTagResponseBodyTag();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedTagResponseBodyTag setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProhibitedTagResponseBodyTag setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProhibitedTagResponseBodyTag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProhibitedTagResponseBodyTag setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
