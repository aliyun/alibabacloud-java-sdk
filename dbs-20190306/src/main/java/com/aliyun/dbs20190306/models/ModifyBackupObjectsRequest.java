// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupObjectsRequest extends TeaModel {
    /**
     * <p>The backup objects that are defined in a JSON string in the following format:</p>
     * <pre><code>[
     *     {
     *         &quot;DBName&quot;:&quot;The name of the database that you want to back up&quot;,
     *         &quot;SchemaName&quot;:&quot;The name of the schema that you want to back up&quot;,
     *         &quot;TableIncludes&quot;:[{
     *             &quot;TableName&quot;:&quot;The name of the table that you want to back up&quot;
     *         }],
     *         &quot;TableExcludes&quot;:[{
     *             &quot;TableName&quot;:&quot;The name of the table that you want to exclude during the backup&quot;
     *         }]
     *     }
     * ]
     * </code></pre>
     * <ul>
     * <li><p>If you specify only <code>DBName</code> and do not specify objects of lower levels, all objects in the database are backed up.</p>
     * </li>
     * <li><p>If you specify <code>DBName</code> and some objects of lower levels, only the specified objects are backed up by default. You can use the following regular expressions to define object names:</p>
     * <ul>
     * <li>A period <code>.</code> matches any single character except <code>\\r\\n</code>.</li>
     * <li>An asterisk <code>*</code> matches zero or more occurrences of a preceding subexpression. For example, <code>h.*llo</code> matches strings such as <code>hllo</code> and <code>heeeello</code>.</li>
     * <li>A question mark <code>?</code> matches zero or one occurrence of a preceding subexpression. For example, <code>h.?llo</code> matches strings such as <code>hllo</code> and <code>hello</code>, but not <code>haello</code>.</li>
     * <li>Character set <code>[Characters]</code> matches a character included in the brackets ([ ]). For example, <code>h[ae]llo</code> matches <code>hallo</code> and <code>hello</code>.</li>
     * <li>Negative character set <code>[^Characters]</code> does not match a character in the brackets ([ ]). For example, <code>h[^ae]llo</code> matches <code>hcllo</code> and <code>hdllo</code>, but not <code>hallo</code> or <code>hello</code>.</li>
     * <li>Character range <code>[character1-character2]</code> matches any character included in the range from <code>character1 to character2</code>, such as <code>[0-9]</code> and <code>[a-z]</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> <code>SchemaName</code> and <code>NewSchemaName</code> apply only to SQL Server databases. Use <code>DBName</code> and <code>NewDBName</code> to specify the names of other databases.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[     {         &quot;DBName&quot;:&quot;17xxx92xxxx374&quot;,         &quot;SchemaName&quot;:&quot;gy9xnj8xxxxxx&quot;,         &quot;TableIncludes&quot;:[{         	&quot;TableName&quot;:&quot;test1&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;test2&quot;         }]     } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The ID of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1h****usfa</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
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
