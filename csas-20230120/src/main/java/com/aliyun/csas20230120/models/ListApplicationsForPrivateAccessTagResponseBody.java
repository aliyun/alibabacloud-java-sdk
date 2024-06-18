// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B608C6AE-623D-55C4-9454-601B88AE937E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTags> tags;

    public static ListApplicationsForPrivateAccessTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForPrivateAccessTagResponseBody self = new ListApplicationsForPrivateAccessTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForPrivateAccessTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsForPrivateAccessTagResponseBody setTags(java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("End")
        public Integer end;

        public static ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges self = new ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class ListApplicationsForPrivateAccessTagResponseBodyTagsApplications extends TeaModel {
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        /**
         * <strong>example:</strong>
         * <p>pa-application-7a9243dd02f4****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>内网访问应用创建时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-27 18:10:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>private_access_application_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PortRanges")
        public java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges> portRanges;

        /**
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListApplicationsForPrivateAccessTagResponseBodyTagsApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForPrivateAccessTagResponseBodyTagsApplications self = new ListApplicationsForPrivateAccessTagResponseBodyTagsApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplications setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplications setPortRanges(java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTagsApplicationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplications setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTagsApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListApplicationsForPrivateAccessTagResponseBodyTags extends TeaModel {
        @NameInMap("Applications")
        public java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTagsApplications> applications;

        /**
         * <strong>example:</strong>
         * <p>tag-7ffc82853476****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        public static ListApplicationsForPrivateAccessTagResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForPrivateAccessTagResponseBodyTags self = new ListApplicationsForPrivateAccessTagResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTags setApplications(java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTagsApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListApplicationsForPrivateAccessTagResponseBodyTagsApplications> getApplications() {
            return this.applications;
        }

        public ListApplicationsForPrivateAccessTagResponseBodyTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
