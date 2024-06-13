// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RdAccountDTO extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("Checked")
    public Boolean checked;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Tags")
    public java.util.List<RdAccountDTOTags> tags;

    public static RdAccountDTO build(java.util.Map<String, ?> map) throws Exception {
        RdAccountDTO self = new RdAccountDTO();
        return TeaModel.build(map, self);
    }

    public RdAccountDTO setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public RdAccountDTO setChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }
    public Boolean getChecked() {
        return this.checked;
    }

    public RdAccountDTO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RdAccountDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RdAccountDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RdAccountDTO setTags(java.util.List<RdAccountDTOTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<RdAccountDTOTags> getTags() {
        return this.tags;
    }

    public static class RdAccountDTOTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static RdAccountDTOTags build(java.util.Map<String, ?> map) throws Exception {
            RdAccountDTOTags self = new RdAccountDTOTags();
            return TeaModel.build(map, self);
        }

        public RdAccountDTOTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public RdAccountDTOTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
