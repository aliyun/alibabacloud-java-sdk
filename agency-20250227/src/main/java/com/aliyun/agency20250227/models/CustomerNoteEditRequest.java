// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteEditRequest extends TeaModel {
    /**
     * <p>The contact information.</p>
     * 
     * <strong>example:</strong>
     * <p>13833333333</p>
     */
    @NameInMap("ContactInformation")
    public String contactInformation;

    /**
     * <p>The name of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>John Smith</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The content of the note.</p>
     * 
     * <strong>example:</strong>
     * <p>Routine customer visit to discuss the agent development plan for the customer</p>
     */
    @NameInMap("NoteContent")
    public String noteContent;

    /**
     * <p>The ID of the note. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1629862</p>
     */
    @NameInMap("NoteId")
    public Long noteId;

    /**
     * <p>The time when the contact was made. The value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1784266662000</p>
     */
    @NameInMap("TouchDate")
    public Long touchDate;

    public static CustomerNoteEditRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteEditRequest self = new CustomerNoteEditRequest();
        return TeaModel.build(map, self);
    }

    public CustomerNoteEditRequest setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }
    public String getContactInformation() {
        return this.contactInformation;
    }

    public CustomerNoteEditRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CustomerNoteEditRequest setNoteContent(String noteContent) {
        this.noteContent = noteContent;
        return this;
    }
    public String getNoteContent() {
        return this.noteContent;
    }

    public CustomerNoteEditRequest setNoteId(Long noteId) {
        this.noteId = noteId;
        return this;
    }
    public Long getNoteId() {
        return this.noteId;
    }

    public CustomerNoteEditRequest setTouchDate(Long touchDate) {
        this.touchDate = touchDate;
        return this;
    }
    public Long getTouchDate() {
        return this.touchDate;
    }

}
