// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCalendarShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the calendar applies to all workspaces. Default value: false.</p>
     * <ul>
     * <li>true: all workspaces.</li>
     * <li>false: the workspaces specified by ProjectIds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllProjects")
    public Boolean allProjects;

    /**
     * <p>The description of the scheduling calendar. The description must be 5 to 2,048 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Weekday scheduling calendar</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The end date of the calendar validity period. Format: <code>yyyy-mm-dd</code>. This parameter is required when Type is set to StrongConstraint. The end date cannot be earlier than the start date, and the interval between the start date and the end date must be less than 5 years.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-09</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The expiration reminder. This parameter is required when Type is set to StrongConstraint.</p>
     * <ul>
     * <li>OneMonthBefore: one month in advance.</li>
     * <li>OneWeekBefore: one week in advance.</li>
     * <li>ThreeDaysBefore: three days in advance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OneMonthBefore</p>
     */
    @NameInMap("ExpirationReminder")
    public String expirationReminder;

    /**
     * <p>The default scheduling policy for dates that are not configured. This parameter is required when Type is set to WeakConstraint.</p>
     * <ul>
     * <li>Normal: normal scheduling.</li>
     * <li>Pause: pause scheduling.</li>
     * <li>Skip: dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("FallbackPolicy")
    public String fallbackPolicy;

    /**
     * <p>The name of the scheduling calendar. The name must be unique within the current tenant and can be up to 100 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>work_calendar</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The scheduling policy after the calendar expires. This parameter is required when Type is set to StrongConstraint.</p>
     * <ul>
     * <li>Normal: normal scheduling.</li>
     * <li>Pause: pause scheduling.</li>
     * <li>Skip: dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Skip</p>
     */
    @NameInMap("OverduePolicy")
    public String overduePolicy;

    /**
     * <p>The account ID of the owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The list of applicable workspace IDs.</p>
     * <ul>
     * <li>If AllProjects is set to false or left empty: This parameter is required and cannot be empty.</li>
     * <li>If AllProjects is set to true: Leave this parameter empty or pass an empty array.</li>
     * </ul>
     */
    @NameInMap("ProjectIds")
    public String projectIdsShrink;

    /**
     * <p>The date scheduling policy. For a strong constraint calendar, the normal scheduling dates and non-scheduling dates must cover every day within the validity period and cannot overlap.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchedulePolicy")
    public String schedulePolicyShrink;

    /**
     * <p>The start date of the calendar validity period. Format: <code>yyyy-mm-dd</code>. This parameter is required when Type is set to StrongConstraint.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-08</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The type of the calendar.</p>
     * <ul>
     * <li>StrongConstraint: strong constraint calendar.</li>
     * <li>WeakConstraint: weak constraint calendar.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StrongConstraint</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateCalendarShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCalendarShrinkRequest self = new CreateCalendarShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCalendarShrinkRequest setAllProjects(Boolean allProjects) {
        this.allProjects = allProjects;
        return this;
    }
    public Boolean getAllProjects() {
        return this.allProjects;
    }

    public CreateCalendarShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCalendarShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateCalendarShrinkRequest setExpirationReminder(String expirationReminder) {
        this.expirationReminder = expirationReminder;
        return this;
    }
    public String getExpirationReminder() {
        return this.expirationReminder;
    }

    public CreateCalendarShrinkRequest setFallbackPolicy(String fallbackPolicy) {
        this.fallbackPolicy = fallbackPolicy;
        return this;
    }
    public String getFallbackPolicy() {
        return this.fallbackPolicy;
    }

    public CreateCalendarShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCalendarShrinkRequest setOverduePolicy(String overduePolicy) {
        this.overduePolicy = overduePolicy;
        return this;
    }
    public String getOverduePolicy() {
        return this.overduePolicy;
    }

    public CreateCalendarShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateCalendarShrinkRequest setProjectIdsShrink(String projectIdsShrink) {
        this.projectIdsShrink = projectIdsShrink;
        return this;
    }
    public String getProjectIdsShrink() {
        return this.projectIdsShrink;
    }

    public CreateCalendarShrinkRequest setSchedulePolicyShrink(String schedulePolicyShrink) {
        this.schedulePolicyShrink = schedulePolicyShrink;
        return this;
    }
    public String getSchedulePolicyShrink() {
        return this.schedulePolicyShrink;
    }

    public CreateCalendarShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateCalendarShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
