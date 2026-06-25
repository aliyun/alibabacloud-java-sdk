// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetRequest extends TeaModel {
    /**
     * <p>The visibility of the dataset in the workspace. Valid values:</p>
     * <ul>
     * <li><p><code>PRIVATE</code> (default): The dataset is visible only to its owner and administrators.</p>
     * </li>
     * <li><p><code>PUBLIC</code>: The dataset is visible to all users in the workspace.</p>
     * </li>
     * <li><p><code>ROLE_PUBLIC</code>: The dataset is visible to users in specific workspace roles. You must specify the roles in the <code>AccessibleRoleIdList</code> parameter. The dataset owner and administrators can always view the dataset.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>This parameter takes effect only when <code>Accessibility</code> is set to <code>ROLE_PUBLIC</code>. It specifies the list of workspace roles that can view the dataset. Role IDs that start with <code>PAI</code> are basic role IDs, and role IDs that start with <code>role-</code> are custom role IDs.</p>
     */
    @NameInMap("AccessibleRoleIdList")
    public java.util.List<String> accessibleRoleIdList;

    /**
     * <p>The description of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the dataset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The dataset edition. You can upgrade a dataset from <code>BASIC</code> to <code>ADVANCED</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ADVANCED</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>A list of workspace roles that have read and write permissions on the mounted dataset. Role IDs that start with <code>PAI</code> are basic role IDs, and role IDs that start with <code>role-</code> are custom role IDs. If the list contains an asterisk (<code>*</code>), all roles are granted read and write permissions.</p>
     * <ul>
     * <li><p>To specify roles: [&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;]</p>
     * </li>
     * <li><p>To specify all roles: [&quot;\*&quot;]</p>
     * </li>
     * <li><p>To specify only the dataset creator: []</p>
     * </li>
     * </ul>
     */
    @NameInMap("MountAccessReadWriteRoleIdList")
    public java.util.List<String> mountAccessReadWriteRoleIdList;

    /**
     * <p>The dataset name. For information about how to obtain the dataset name, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>An extended field in a JSON string format. When you use the dataset with Data Lake Compute (DLC), you can configure the <code>mountPath</code> field to specify the default mount path.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
     * }</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The sharing configuration of the dataset.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SharingConfig")
    public UpdateDatasetRequestSharingConfig sharingConfig;

    public static UpdateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetRequest self = new UpdateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateDatasetRequest setAccessibleRoleIdList(java.util.List<String> accessibleRoleIdList) {
        this.accessibleRoleIdList = accessibleRoleIdList;
        return this;
    }
    public java.util.List<String> getAccessibleRoleIdList() {
        return this.accessibleRoleIdList;
    }

    public UpdateDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDatasetRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public UpdateDatasetRequest setMountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
        this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
        return this;
    }
    public java.util.List<String> getMountAccessReadWriteRoleIdList() {
        return this.mountAccessReadWriteRoleIdList;
    }

    public UpdateDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDatasetRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public UpdateDatasetRequest setSharingConfig(UpdateDatasetRequestSharingConfig sharingConfig) {
        this.sharingConfig = sharingConfig;
        return this;
    }
    public UpdateDatasetRequestSharingConfig getSharingConfig() {
        return this.sharingConfig;
    }

    public static class UpdateDatasetRequestSharingConfig extends TeaModel {
        /**
         * <p>The sharing relationships of the dataset.</p>
         */
        @NameInMap("SharedTo")
        public java.util.List<DatasetShareRelationship> sharedTo;

        public static UpdateDatasetRequestSharingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestSharingConfig self = new UpdateDatasetRequestSharingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestSharingConfig setSharedTo(java.util.List<DatasetShareRelationship> sharedTo) {
            this.sharedTo = sharedTo;
            return this;
        }
        public java.util.List<DatasetShareRelationship> getSharedTo() {
            return this.sharedTo;
        }

    }

}
