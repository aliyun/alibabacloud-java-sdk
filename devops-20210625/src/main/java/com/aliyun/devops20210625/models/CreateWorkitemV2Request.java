// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19xxxx31947xxxx</p>
     */
    @NameInMap("assignedTo")
    public String assignedTo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Req</p>
     */
    @NameInMap("category")
    public String category;

    @NameInMap("description")
    public String description;

    @NameInMap("fieldValueList")
    public java.util.List<CreateWorkitemV2RequestFieldValueList> fieldValueList;

    /**
     * <strong>example:</strong>
     * <p>11223331122</p>
     */
    @NameInMap("parentIdentifier")
    public String parentIdentifier;

    @NameInMap("participants")
    public java.util.List<String> participants;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asd345xxxxx9q9845xxxxx34</p>
     */
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    /**
     * <strong>example:</strong>
     * <p>455532323455</p>
     */
    @NameInMap("sprintIdentifier")
    public String sprintIdentifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("subject")
    public String subject;

    @NameInMap("tags")
    public java.util.List<String> tags;

    @NameInMap("trackers")
    public java.util.List<String> trackers;

    /**
     * <strong>example:</strong>
     * <p>1561159309......</p>
     */
    @NameInMap("verifier")
    public String verifier;

    @NameInMap("versions")
    public java.util.List<String> versions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9uy29901re573f561d69jn40</p>
     */
    @NameInMap("workitemTypeIdentifier")
    public String workitemTypeIdentifier;

    public static CreateWorkitemV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemV2Request self = new CreateWorkitemV2Request();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemV2Request setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public CreateWorkitemV2Request setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateWorkitemV2Request setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkitemV2Request setFieldValueList(java.util.List<CreateWorkitemV2RequestFieldValueList> fieldValueList) {
        this.fieldValueList = fieldValueList;
        return this;
    }
    public java.util.List<CreateWorkitemV2RequestFieldValueList> getFieldValueList() {
        return this.fieldValueList;
    }

    public CreateWorkitemV2Request setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateWorkitemV2Request setParticipants(java.util.List<String> participants) {
        this.participants = participants;
        return this;
    }
    public java.util.List<String> getParticipants() {
        return this.participants;
    }

    public CreateWorkitemV2Request setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public CreateWorkitemV2Request setSprintIdentifier(String sprintIdentifier) {
        this.sprintIdentifier = sprintIdentifier;
        return this;
    }
    public String getSprintIdentifier() {
        return this.sprintIdentifier;
    }

    public CreateWorkitemV2Request setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateWorkitemV2Request setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public CreateWorkitemV2Request setTrackers(java.util.List<String> trackers) {
        this.trackers = trackers;
        return this;
    }
    public java.util.List<String> getTrackers() {
        return this.trackers;
    }

    public CreateWorkitemV2Request setVerifier(String verifier) {
        this.verifier = verifier;
        return this;
    }
    public String getVerifier() {
        return this.verifier;
    }

    public CreateWorkitemV2Request setVersions(java.util.List<String> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<String> getVersions() {
        return this.versions;
    }

    public CreateWorkitemV2Request setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
        this.workitemTypeIdentifier = workitemTypeIdentifier;
        return this;
    }
    public String getWorkitemTypeIdentifier() {
        return this.workitemTypeIdentifier;
    }

    public static class CreateWorkitemV2RequestFieldValueList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6aexxxxxa1d98c09c60xxxx16</p>
         */
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateWorkitemV2RequestFieldValueList build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemV2RequestFieldValueList self = new CreateWorkitemV2RequestFieldValueList();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemV2RequestFieldValueList setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public CreateWorkitemV2RequestFieldValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
