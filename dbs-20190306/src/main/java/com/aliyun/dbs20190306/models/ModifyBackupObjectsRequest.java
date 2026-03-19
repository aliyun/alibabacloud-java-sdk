// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupObjectsRequest extends TeaModel {
    /**
     * <p>The backup objects, specified as a JSON string. The structure is as follows:</p>
     * <pre><code>[
     *     {
     *         &quot;DBName&quot;:&quot;The name of the database to back up&quot;,
     *         &quot;SchemaName&quot;:&quot;The name of the schema to back up&quot;,
     *         &quot;TableIncludes&quot;:[{
     *             &quot;TableName&quot;:&quot;The name of the table to back up&quot;
     *         }],
     *         &quot;TableExcludes&quot;:[{
     *             &quot;TableName&quot;:&quot;The name of a table in the database that you do not want to back up&quot;
     *         }]
     *     }
     * ]
     * </code></pre>
     * <ul>
     * <li><p>If you specify only <code>DBName</code> without configuring rules for sub-objects, all objects in the database are backed up.</p>
     * </li>
     * <li><p>If you specify <code>DBName</code> and configure rules for some objects, any objects without configured rules are not backed up by default. The following regular expressions are supported for defining object names:</p>
     * <ul>
     * <li>A period (<code>.</code>) matches any single character except `</li>
     * </ul>
     * </li>
     * </ul>
     * <p>`.</p>
     * <ul>
     * <li><p>An asterisk (<code>*</code>) matches the preceding subexpression zero or more times. For example, <code>h*llo</code> matches <code>hllo</code> and <code>heeeello</code>.</p>
     * </li>
     * <li><p>A question mark (<code>?</code>) matches the preceding subexpression zero or one time. For example, <code>h.?llo</code> matches <code>hllo</code> and <code>hello</code>, but not <code>haello</code>.</p>
     * </li>
     * <li><p>A character set <code>[characters]</code> matches any single character within the brackets. For example, <code>h[aello]</code> matches <code>hallo</code> and <code>hello</code>.</p>
     * </li>
     * <li><p>A negated character set <code>[^characters]</code> matches any single character not within the brackets. For example, <code>h[^ae]llo</code> matches <code>hcllo</code> and <code>hdllo</code>, but not <code>hallo</code> or <code>hello</code>.</p>
     * </li>
     * <li><p>A character range <code>[character1-character2]</code> matches any character within the specified range, such as <code>[0-9]</code> or <code>[a-z]</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p><code>SchemaName</code> and <code>NewSchemaName</code> are used only for SQL Server. For other database engines, use <code>DBName</code> and <code>NewDBName</code> to specify database names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[     {         &quot;DBName&quot;:&quot;17xxx92xxxx374&quot;,         &quot;SchemaName&quot;:&quot;gy9xnj8xxxxxx&quot;,         &quot;TableIncludes&quot;:[{         	&quot;TableName&quot;:&quot;test1&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;test2&quot;         }]     } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The ID of the backup plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1h****usfa</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>A client token to ensure the request is idempotent. This prevents the same request from being submitted multiple times.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyBackupObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupObjectsRequest self = new ModifyBackupObjectsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupObjectsRequest setBackupObjects(String backupObjects) {
        this.backupObjects = backupObjects;
        return this;
    }
    public String getBackupObjects() {
        return this.backupObjects;
    }

    public ModifyBackupObjectsRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupObjectsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBackupObjectsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
