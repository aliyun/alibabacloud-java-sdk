// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretList")
    public ListSecretsResponseBodySecretList secretList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsResponseBody self = new ListSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSecretsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecretsResponseBody setSecretList(ListSecretsResponseBodySecretList secretList) {
        this.secretList = secretList;
        return this;
    }
    public ListSecretsResponseBodySecretList getSecretList() {
        return this.secretList;
    }

    public ListSecretsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListSecretsResponseBodySecretListSecretTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static ListSecretsResponseBodySecretListSecretTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodySecretListSecretTagsTag self = new ListSecretsResponseBodySecretListSecretTagsTag();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodySecretListSecretTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListSecretsResponseBodySecretListSecretTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class ListSecretsResponseBodySecretListSecretTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListSecretsResponseBodySecretListSecretTagsTag> tag;

        public static ListSecretsResponseBodySecretListSecretTags build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodySecretListSecretTags self = new ListSecretsResponseBodySecretListSecretTags();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodySecretListSecretTags setTag(java.util.List<ListSecretsResponseBodySecretListSecretTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListSecretsResponseBodySecretListSecretTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListSecretsResponseBodySecretListSecret extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SecretName")
        public String secretName;

        @NameInMap("Tags")
        public ListSecretsResponseBodySecretListSecretTags tags;

        @NameInMap("SecretType")
        public String secretType;

        @NameInMap("PlannedDeleteTime")
        public String plannedDeleteTime;

        public static ListSecretsResponseBodySecretListSecret build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodySecretListSecret self = new ListSecretsResponseBodySecretListSecret();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodySecretListSecret setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSecretsResponseBodySecretListSecret setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSecretsResponseBodySecretListSecret setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public ListSecretsResponseBodySecretListSecret setTags(ListSecretsResponseBodySecretListSecretTags tags) {
            this.tags = tags;
            return this;
        }
        public ListSecretsResponseBodySecretListSecretTags getTags() {
            return this.tags;
        }

        public ListSecretsResponseBodySecretListSecret setSecretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
        public String getSecretType() {
            return this.secretType;
        }

        public ListSecretsResponseBodySecretListSecret setPlannedDeleteTime(String plannedDeleteTime) {
            this.plannedDeleteTime = plannedDeleteTime;
            return this;
        }
        public String getPlannedDeleteTime() {
            return this.plannedDeleteTime;
        }

    }

    public static class ListSecretsResponseBodySecretList extends TeaModel {
        @NameInMap("Secret")
        public java.util.List<ListSecretsResponseBodySecretListSecret> secret;

        public static ListSecretsResponseBodySecretList build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodySecretList self = new ListSecretsResponseBodySecretList();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodySecretList setSecret(java.util.List<ListSecretsResponseBodySecretListSecret> secret) {
            this.secret = secret;
            return this;
        }
        public java.util.List<ListSecretsResponseBodySecretListSecret> getSecret() {
            return this.secret;
        }

    }

}
