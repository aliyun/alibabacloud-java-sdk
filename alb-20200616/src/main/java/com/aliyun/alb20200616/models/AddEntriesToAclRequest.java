// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddEntriesToAclRequest extends TeaModel {
    // 条目信息列表
    @NameInMap("AclEntries")
    public java.util.List<AddEntriesToAclRequestAclEntries> aclEntries;

    // AclId
    @NameInMap("AclId")
    public String aclId;

    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    // dryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static AddEntriesToAclRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEntriesToAclRequest self = new AddEntriesToAclRequest();
        return TeaModel.build(map, self);
    }

    public AddEntriesToAclRequest setAclEntries(java.util.List<AddEntriesToAclRequestAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<AddEntriesToAclRequestAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public AddEntriesToAclRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AddEntriesToAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddEntriesToAclRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class AddEntriesToAclRequestAclEntries extends TeaModel {
        // 描述信息
        @NameInMap("Description")
        public String description;

        // 条目
        @NameInMap("Entry")
        public String entry;

        public static AddEntriesToAclRequestAclEntries build(java.util.Map<String, ?> map) throws Exception {
            AddEntriesToAclRequestAclEntries self = new AddEntriesToAclRequestAclEntries();
            return TeaModel.build(map, self);
        }

        public AddEntriesToAclRequestAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddEntriesToAclRequestAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

}
