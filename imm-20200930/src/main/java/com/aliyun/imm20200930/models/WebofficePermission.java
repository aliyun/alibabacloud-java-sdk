// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class WebofficePermission extends TeaModel {
    /**
     * <p>Specifies whether the user has the copy permission. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Copy")
    public Boolean copy;

    /**
     * <p>Specifies whether the user has the permission to export the file as a PDF file. Valid values:</p>
     * <ul>
     * <li>true: The user has the permission to export the file as a PDF file. If you set this parameter to true, you must set the Print parameter to true.</li>
     * <li>false: The user does not have the permission to export the file as a PDF file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Export")
    public Boolean export;

    /**
     * <p>Specifies whether the user has the permission to view historical versions. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("History")
    public Boolean history;

    /**
     * <p>Specifies whether the user has the printing permission. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Print")
    public Boolean print;

    /**
     * <p>Specifies whether the user has read-only access to the file. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Readonly")
    public Boolean readonly;

    /**
     * <p>Specifies whether the user has the permission to rename a file. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> You can query the operation information only based a notification sent to Simple Message Queue (SMQ). A rename event is included in the notification.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Rename")
    public Boolean rename;

    public static WebofficePermission build(java.util.Map<String, ?> map) throws Exception {
        WebofficePermission self = new WebofficePermission();
        return TeaModel.build(map, self);
    }

    public WebofficePermission setCopy(Boolean copy) {
        this.copy = copy;
        return this;
    }
    public Boolean getCopy() {
        return this.copy;
    }

    public WebofficePermission setExport(Boolean export) {
        this.export = export;
        return this;
    }
    public Boolean getExport() {
        return this.export;
    }

    public WebofficePermission setHistory(Boolean history) {
        this.history = history;
        return this;
    }
    public Boolean getHistory() {
        return this.history;
    }

    public WebofficePermission setPrint(Boolean print) {
        this.print = print;
        return this;
    }
    public Boolean getPrint() {
        return this.print;
    }

    public WebofficePermission setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

    public WebofficePermission setRename(Boolean rename) {
        this.rename = rename;
        return this;
    }
    public Boolean getRename() {
        return this.rename;
    }

}
